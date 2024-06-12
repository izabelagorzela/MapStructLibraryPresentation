package gorzela.izabela.MapStructDemo.mappers.mappingComposition;

import gorzela.izabela.MapStructDemo.mappingComposition.shared.Contact;
import gorzela.izabela.MapStructDemo.mappingComposition.shared.Patient;
import gorzela.izabela.MapStructDemo.mappingComposition.shared.PatientDto;
import gorzela.izabela.MapStructDemo.mappingComposition.case3.PatientMapperWithContactMapperAsSpringComponent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PatientMapperWithContactMapperAsSpringComponentTest {

    @Autowired
    PatientMapperWithContactMapperAsSpringComponent patientMapperWithContactMapperAsSpringComponent;

   @Test
    void shouldMapPatientToPatientDto() {

        Patient patient = new Patient();
        patient.setSurname("Forenc");
        patient.setContact(new Contact("forenc@wp.pl", "128786435"));

        PatientDto patientDto = patientMapperWithContactMapperAsSpringComponent.patientToPatientDto(patient);

        assertEquals(patient.getSurname(), patientDto.getSurname());
        assertEquals(patient.getContact().getEmail(), patientDto.getContactDto().getEmail());
        assertEquals(patient.getContact().getPhone(), patientDto.getContactDto().getPhone());

    }
}