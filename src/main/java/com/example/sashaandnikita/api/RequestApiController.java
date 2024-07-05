package com.example.sashaandnikita.api;

import com.example.sashaandnikita.models.Request;
import com.example.sashaandnikita.services.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/requests")
public class RequestApiController {

    private final RequestService requestService;

    @Autowired
    public RequestApiController(RequestService requestService) {
        this.requestService = requestService;
    }

    @GetMapping
    public List<Request> getAllRequests() {
        return requestService.findAll();
    }

    @PostMapping
    public Request createRequest(@RequestBody Request request) {
        return requestService.saveRequest(request);
    }


    @GetMapping("/{id}")
    public Request getRequestById(@PathVariable Long id) {
        return requestService.findById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Request> updateRequest(@PathVariable Long id, @RequestBody Request updatedRequest) {
        // Проверка существования пользователя с заданным id
        Request existingRequest = requestService.findById(id);
        if (existingRequest == null) {
            return ResponseEntity.notFound().build();
        }

        // Обновление полей пользователя
        existingRequest.setNameSurname(updatedRequest.getNameSurname());
        existingRequest.setPhoneCode(updatedRequest.getPhoneCode());
        existingRequest.setPhoneNumber(updatedRequest.getPhoneNumber());
        existingRequest.setRequestStatus(updatedRequest.getRequestStatus());
        existingRequest.setStructure(updatedRequest.getStructure());


        // Сохранение обновленного пользователя
        Request updatedRequestData = requestService.saveRequest(existingRequest);
        return ResponseEntity.ok(updatedRequestData);
    }

    @DeleteMapping("/{id}")
    public void deleteRequest(@PathVariable Long id) {
        requestService.deleteById(id);
    }
}