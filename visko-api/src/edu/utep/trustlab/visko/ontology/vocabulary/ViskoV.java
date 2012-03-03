/*
Copyright (c) 2012, University of Texas at El Paso
All rights reserved.
Redistribution and use in source and binary forms, with or without modification, are permitted
provided that the following conditions are met:

	-Redistributions of source code must retain the above copyright notice, this list of conditions
	 and the following disclaimer.
	-Redistributions in binary form must reproduce the above copyright notice, this list of conditions
	 and the following disclaimer in the documentation and/or other materials provided with the distribution.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED
WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE
GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.*/


package edu.utep.trustlab.visko.ontology.vocabulary;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.ontology.Ontology;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class ViskoV {
	public static final String ONTOLOGY_VISKO_V_URI = "http://trust.utep.edu/visko/ontology/visko-view-v3.owl";

	// Concepts
	public static final String CLASS_URI_VIEW = ONTOLOGY_VISKO_V_URI + "#View";
	public static final String CLASS_URI_COMPOSITE_VIEW = ONTOLOGY_VISKO_V_URI
			+ "#CompositeView";
	public static final String CLASS_URI_ATOMIC_VIEW = ONTOLOGY_VISKO_V_URI
			+ "#AtomicView";
	public static final String CLASS_URI_NETWORK = ONTOLOGY_VISKO_V_URI
			+ "#Network";
	public static final String CLASS_URI_GRAPH = ONTOLOGY_VISKO_V_URI
			+ "#Graph";
	public static final String CLASS_URI_TREE = ONTOLOGY_VISKO_V_URI + "#Tree";
	public static final String CLASS_URI_RASTER = ONTOLOGY_VISKO_V_URI
			+ "#Raster";

	/*****************************************************************************************/

	// Properties
	public static final String PROPERTY_URI_INCLUDES_VIEW = ONTOLOGY_VISKO_V_URI
			+ "#includesView";

	// model and ontology
	private static OntModel model;
	private static Ontology ontology;

	static {
		model = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
		model.read(ONTOLOGY_VISKO_V_URI);
		ontology = model.getOntology(ONTOLOGY_VISKO_V_URI);
	}

	public static OntModel getModel() {
		return model;
	}

	public static Ontology getOntology() {
		return ontology;
	}
}
