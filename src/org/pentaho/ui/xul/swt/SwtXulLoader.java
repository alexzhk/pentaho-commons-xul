package org.pentaho.ui.xul.swt;

import org.dom4j.Document;
import org.pentaho.ui.xul.XulException;
import org.pentaho.ui.xul.XulLoader;
import org.pentaho.ui.xul.XulParser;
import org.pentaho.ui.xul.XulRunner;
import org.pentaho.ui.xul.XulWindowContainer;

import org.pentaho.ui.xul.dom.DocumentFactory;
import org.pentaho.ui.xul.dom.dom4j.DocumentDom4J;
import org.pentaho.ui.xul.dom.dom4j.ElementDom4J;
import org.pentaho.ui.xul.swing.SwingXulRunner;
import org.pentaho.ui.xul.swing.tags.SwingButtonHandler;
import org.pentaho.ui.xul.swing.tags.SwingHboxHandler;
import org.pentaho.ui.xul.swing.tags.SwingLabelHandler;
import org.pentaho.ui.xul.swing.tags.SwingScriptHandler;
import org.pentaho.ui.xul.swing.tags.SwingTextboxHandler;
import org.pentaho.ui.xul.swing.tags.SwingVboxHandler;
import org.pentaho.ui.xul.swing.tags.SwingWindowHandler;

public class SwtXulLoader implements XulLoader {

  public XulRunner loadXul(Document xulDocument) throws IllegalArgumentException, XulException {


    DocumentFactory.registerDOMClass(DocumentDom4J.class);
    DocumentFactory.registerElementClass(ElementDom4J.class);
    
    XulWindowContainer container = new XulWindowContainer();
    XulParser parser = new XulParser(container);
    
    //attach Renderers
    parser.registerHandler("WINDOW", "org.pentaho.ui.xul.swt.tags.SwtWindow");
    parser.registerHandler("BUTTON", "org.pentaho.ui.xul.swt.tags.SwtButton");
    parser.registerHandler("BOX", "org.pentaho.ui.xul.swt.tags.SwtBox");
    parser.registerHandler("VBOX", "org.pentaho.ui.xul.swt.tags.SwtVbox");
    parser.registerHandler("HBOX", "org.pentaho.ui.xul.swt.tags.SwtHbox");
    parser.registerHandler("LABEL", "org.pentaho.ui.xul.swt.tags.SwtLabel");
    parser.registerHandler("TEXTBOX", "org.pentaho.ui.xul.swt.tags.SwtTextbox");
    parser.registerHandler("GROUPBOX", "org.pentaho.ui.xul.swt.tags.SwtGroupbox");
    parser.registerHandler("CAPTION", "org.pentaho.ui.xul.swt.tags.SwtCaption");
    parser.registerHandler("LISTBOX", "org.pentaho.ui.xul.swt.tags.SwtListbox");
    parser.registerHandler("SCRIPT", "org.pentaho.ui.xul.swt.tags.SwtScript");

    parser.parseDocument(xulDocument.getRootElement());
    
    DocumentFactory.registerDOMClass(DocumentDom4J.class);
    
    XulRunner runner = new SwtXulRunner();
    runner.addContainer(container);
    
    return runner;
    
  }

}
