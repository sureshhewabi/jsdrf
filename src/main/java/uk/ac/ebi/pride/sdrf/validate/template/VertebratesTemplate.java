package uk.ac.ebi.pride.sdrf.validate.template;

import uk.ac.ebi.pride.sdrf.validate.model.SDRFColumnSchema;
import uk.ac.ebi.pride.sdrf.validate.model.SDRFContent;
import uk.ac.ebi.pride.sdrf.validate.model.ValidationError;
import uk.ac.ebi.pride.sdrf.validate.util.Constants.*;
import uk.ac.ebi.pride.sdrf.validate.validation.SDRFValidator;

import java.util.List;

/**
 * @author Suresh Hewapathirana
 */
public class VertebratesTemplate extends DefaultTemplate {

    public VertebratesTemplate(SDRFContent sdrfContent) {
        super(sdrfContent);
        this.sdrfSchemaColumns.add(new SDRFColumnSchema("characteristics[developmental stage]", true, false, Ontology.NONE));
    }

    @Override
    public List<ValidationError> validate() {
        List<ValidationError> errors  = super.validate();
        System.out.println("Vertibrates template validation running...");
        errors.addAll(SDRFValidator.validate(this.sdrfContent, this.sdrfSchemaColumns));
        return errors;
    }
}
