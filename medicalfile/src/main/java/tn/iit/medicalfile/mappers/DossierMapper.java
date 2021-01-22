package tn.iit.medicalfile.mappers;

import tn.iit.medicalfile.domain.DossierMedical;
import tn.iit.medicalfile.dto.DossierDto;
import tn.iit.medicalfile.dto.PatientDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DossierMapper {

    public static DossierDto dossierToDossierDto(DossierMedical dossier)
    {
        DossierDto dossierDto = new DossierDto ();
        dossierDto.setId (dossier.getId ());
        dossierDto.setPatientId (dossier.getPatient().getId ());
        dossierDto.setPatientName (dossier.getPatient ().getName ());
        return dossierDto;
    }

    public static DossierMedical dossierDtoToDossier(DossierDto dossierDto)
    {
        DossierMedical dossier = new DossierMedical();
        dossier.setId (dossierDto.getId ());
        dossier.setPatient (PatientMapper.patientDtoToPatient (new PatientDto(dossierDto.getPatientId ())));
        return dossier;
    }

    public static Collection<DossierDto> dossiersToDossierDtos(Collection<DossierMedical> categories)
    {
        List<DossierDto> dossierDtoList = new ArrayList<>();
        categories.forEach(dossier -> {
            dossierDtoList.add (dossierToDossierDto (dossier));
        });
        return dossierDtoList;
    }
}
