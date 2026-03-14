package com.tugas.Tugas_CRUD_20230140037.repository;

import com.tugas.Tugas_CRUD_20230140037.entity.KtpEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KtpRepository extends JpaRepository<KtpEntity, Integer> {
    boolean existsByNomorKtp(String nomorKtp);
}