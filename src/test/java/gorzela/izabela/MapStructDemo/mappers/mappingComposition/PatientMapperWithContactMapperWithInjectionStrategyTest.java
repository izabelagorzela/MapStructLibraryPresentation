package gorzela.izabela.MapStructDemo.mappers.mappingComposition;

import gorzela.izabela.MapStructDemo.entities.mappingComposition.Contact;
import gorzela.izabela.MapStructDemo.entities.mappingComposition.Patient;
import gorzela.izabela.MapStructDemo.entities.mappingComposition.PatientDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PatientMapperWithContactMapperWithInjectionStrategyTest {

    @Autowired
    PatientMapperWithContactMapperWithInjectionStrategy patientMapperWithContactMapperWithInjectionStrategy;

    @Test
    void shouldMapPatientToPatientDto() {

        Patient patient = new Patient();
        patient.setSurname("Forenc");
        patient.setContact(new Contact("forenc@wp.pl", "128786435"));

        PatientDto patientDto = patientMapperWithContactMapperWithInjectionStrategy.patientToPatientDto(patient);

        assertEquals(patient.getSurname(), patientDto.getSurname());
        assertEquals(patient.getContact().getEmail(), patientDto.getContactDto().getEmail());
        assertEquals(patient.getContact().getPhone(), patientDto.getContactDto().getPhone());

    }
}