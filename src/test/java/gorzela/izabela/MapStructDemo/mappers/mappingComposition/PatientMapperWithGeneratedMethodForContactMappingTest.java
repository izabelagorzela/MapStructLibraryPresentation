package gorzela.izabela.MapStructDemo.mappers.mappingComposition;

import gorzela.izabela.MapStructDemo.mappingComposition.case1.PatientMapperWithGeneratedMethodForContactMapping;
import gorzela.izabela.MapStructDemo.mappingComposition.shared.Contact;
import gorzela.izabela.MapStructDemo.mappingComposition.shared.Patient;
import gorzela.izabela.MapStructDemo.mappingComposition.shared.PatientDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatientMapperWithGeneratedMethodForContactMappingTest {

    @Test
    void shouldMapPatientToPatientDto() {

        Patient patient = new Patient();
        patient.setSurname("Forenc");
        patient.setContact(new Contact("forenc@wp.pl", "985342908"));

        PatientDto patientDto = PatientMapperWithGeneratedMethodForContactMapping.INSTANCE.patientToPatientDto(patient);

        assertEquals(patient.getSurname(), patientDto.getSurname());
        assertEquals(patient.getContact().getEmail(), patientDto.getContactDto().getEmail());
        assertEquals(patient.getContact().getPhone(), patientDto.getContactDto().getPhone());
    }
}