package org.docx4j.openpackaging.parts.SpreadsheetML;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.docx4j.openpackaging.contenttype.ContentTypes;
import org.docx4j.openpackaging.exceptions.InvalidFormatException;
import org.docx4j.openpackaging.exceptions.PartUnrecognisedException;
import org.docx4j.openpackaging.parts.JaxbXmlPart;
import org.docx4j.openpackaging.parts.Part;
import org.docx4j.openpackaging.parts.PartName;
import org.xlsx4j.jaxb.Context;

public abstract class JaxbSmlPart<E>  extends JaxbXmlPart<E> {

	public JaxbSmlPart(PartName partName) throws InvalidFormatException {
		super(partName);
		setJAXBContext(Context.jcSML);						
	}

	public JaxbSmlPart() throws InvalidFormatException {
		super(new PartName("/xl/blagh.xml"));
		setJAXBContext(Context.jcSML);						
	}

	public static Part newPartForContentType(String contentType, String partName)
	throws InvalidFormatException, PartUnrecognisedException {
		
		if (contentType.equals(ContentTypes.SPREADSHEETML_MAIN)) {
			return new WorkbookPart(
					new PartName(partName));
		} else if (contentType
				.equals(ContentTypes.SPREADSHEETML_PRINTER_SETTINGS)) {
			return new PrinterSettings(
					new PartName(partName));
		} else if (contentType.equals(ContentTypes.SPREADSHEETML_STYLES)) {
			return new Styles(
					new PartName(partName));

		} else if (contentType.equals(ContentTypes.SPREADSHEETML_WORKSHEET)) {
			return new WorksheetPart(
					new PartName(partName));

		} else if (contentType.equals(ContentTypes.SPREADSHEETML_CALC_CHAIN)) {
			return new CalcChain(
					new PartName(partName));

		} else if (contentType
				.equals(ContentTypes.SPREADSHEETML_SHARED_STRINGS)) {
			return new SharedStrings(
					new PartName(partName));
		} else {
			throw new PartUnrecognisedException("No subclass found for " 
					+ partName + " (content type '" + contentType + "')");					
		}
	}	
	
//    public E unmarshal( java.io.InputStream is ) throws JAXBException {
//    	
//		try {
//			setJAXBContext(Context.jcPML);						
//		    		    
//			Unmarshaller u = jc.createUnmarshaller();
//			u.setEventHandler(new org.docx4j.jaxb.JaxbValidationEventHandler());
//
//			jaxbElement = (E)u.unmarshal( is );						
//			log.debug( this.getClass().getName() + " unmarshalled" );									
//
//		} catch (JAXBException e ) {
//			log.error(e);
//			throw e;
//		}
//		return jaxbElement;
//    }	
    
	
}
