package facturas;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import facturas.entidades.FacturaEntity;
import facturas.pdf.PDF;


@SpringBootApplication
public class Facturas {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(Facturas.class, args);

	}

}
