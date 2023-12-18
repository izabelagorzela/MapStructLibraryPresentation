package gorzela.izabela.MapStructDemo.mappers.mappingComposition;

import gorzela.izabela.MapStructDemo.entities.mappingComposition.Contact;
import gorzela.izabela.MapStructDemo.entities.mappingComposition.Patient;
import gorzela.izabela.MapStructDemo.entities.mappingComposition.PatientDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatientMapperWithDefaultMethodTest {

   @Test
    void shouldMapPatientToPatientDto() {

        Patient patient = new Patient();
        patient.setSurname("Forenc");
        patient.setContact(new Contact("forenc@wp.pl", "128786435"));

        PatientDto patientDto = PatientMapperWithDefaultMethod.INSTANCE.patientToPatientDto(patient);

        assertEquals(patient.getSurname(), patientDto.getSurname());
        assertEquals(patient.getContact().getEmail(), patientDto.getContactDto().getEmail());
        assertEquals(patient.getContact().getPhone(), patientDto.getContactDto().getPhone());
    }
}