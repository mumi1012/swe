package de.shop.kundenverwaltung.service;

import java.util.Collection;

import javax.validation.ConstraintViolation;

import de.shop.kundenverwaltung.domain.AbstractKunde;

public abstract class InvalidKundeIdException extends AbstractKundeValidationException {
	private static final long serialVersionUID = -8973151010781329074L;
	
	private final Long kundeId;
	
	public InvalidKundeIdException(Long kundeId, Collection<ConstraintViolation<AbstractKunde>> violations) {
		super(violations);
		this.kundeId = kundeId;
	}

	public Long getKundeId() {
		return kundeId;
	}
}
