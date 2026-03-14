package com.tugas.Tugas_CRUD_20230140037.controller;

import com.tugas.Tugas_CRUD_20230140037.dto.KtpDto;
import com.tugas.Tugas_CRUD_20230140037.service.KtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ktp")
@CrossOrigin
public class KtpController {

    @Autowired
    private KtpService ktpService;

    @PostMapping
    public ResponseEntity<KtpDto> tambahKtp(@RequestBody KtpDto ktpDto) {
        return ResponseEntity.ok(ktpService.tambahKtp(ktpDto));
    }

    @GetMapping
    public ResponseEntity<List<KtpDto>> ambilSemuaKtp() {
        return ResponseEntity.ok(ktpService.ambilSemuaKtp());
    }

    @GetMapping("/{id}")
    public ResponseEntity<KtpDto> ambilKtpById(@PathVariable Integer id) {
        return ResponseEntity.ok(ktpService.ambilKtpById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<KtpDto> updateKtp(@PathVariable Integer id, @RequestBody KtpDto ktpDto) {
        return ResponseEntity.ok(ktpService.updateKtp(id, ktpDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> hapusKtp(@PathVariable Integer id) {
        ktpService.hapusKtp(id);
        return ResponseEntity.noContent().build();
    }
}