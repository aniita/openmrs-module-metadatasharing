/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.metadatasharing.api;

import java.util.List;

import org.openmrs.ConceptSource;
import org.openmrs.annotation.OpenmrsProfile;
import org.openmrs.api.context.Context;

@OpenmrsProfile(openmrsPlatformVersion = "2.0.*")
public class ConceptServiceCompatibility2_0 implements ConceptServiceCompatibility {

	@Override
	public List<ConceptSource> getAllConceptSources() {
		return Context.getConceptService().getAllConceptSources(false);
	}
}
