/*
 * 
 */
package org.sbml.layoutconverter;

import java.io.File;
import java.io.IOException;

import javax.xml.stream.XMLStreamException;

import org.sbml.jsbml.SBMLDocument;
import org.sbml.jsbml.SBMLException;
import org.sbml.jsbml.SBMLReader;
import org.sbml.jsbml.SBMLWriter;

// TODO: Auto-generated Javadoc
/**
 * The Class ModelUpgrader.
 *
 * @author Kaito Ii
 * 
 * Date Created: May 26, 2016
 */

public class SBMLLevelandVersionHandler {
	
	/** The is set SBO term. */
	static boolean isSetSBOTerm = true;
	
	/**
	 * Upgrade.
	 *
	 * @param document the document
	 * @return SBMLDocument
	 * TODO
	 */
	public static SBMLDocument upgrade(SBMLDocument document){
		if(document.getLevel() != SBMLUtil.DEFAULT_SBML_LEVEL || document.getVersion() != SBMLUtil.DEFAULT_SBML_VERSION ){
			document.setLevelAndVersion(SBMLUtil.DEFAULT_SBML_LEVEL, SBMLUtil.DEFAULT_SBML_VERSION);
			System.out.println("SBML Model converted to Level " + SBMLUtil.DEFAULT_SBML_LEVEL + " Version " + SBMLUtil.DEFAULT_SBML_VERSION);
		}
		
		
		if(!SBMLUtil.isSetSBOTerm(document))
			System.err.println("Missing sboterms");
		
		document = SBMLModelCompleter.autoCompleteRequiredAttributes(document);
		
		return document;
	}

	/**
	 * Downgrade.
	 *
	 * @param document the document
	 * @return the SBML document
	 */
	public static SBMLDocument downgrade(SBMLDocument document){
		if(document.getLevel() > SBMLUtil.DEFAULT_CELLDESIGNER_SBML_LEVEL || document.getVersion() != SBMLUtil.DEFAULT_CELLDESIGNER_SBML_VERSION)
			document.setLevelAndVersion(SBMLUtil.DEFAULT_CELLDESIGNER_SBML_LEVEL, SBMLUtil.DEFAULT_CELLDESIGNER_SBML_VERSION);
		
		return document;
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args){
		try {
			SBMLDocument d = SBMLReader.read(new File("/Users/ii/models/level3/spatial_example1.xml"));
			d = SBMLLevelandVersionHandler.downgrade(d);
			
		} catch (XMLStreamException | IOException e) {
			e.printStackTrace();
		}
	}
	
}
