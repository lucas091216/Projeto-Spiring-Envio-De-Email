package com.ms.msemail.repositories;

import com.ms.msemail.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepositori extends JpaRepository<EmailModel, Long> {
}
