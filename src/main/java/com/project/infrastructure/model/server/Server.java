package com.project.infrastructure.model.server;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Table(name = "SERVER")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Server {
}
