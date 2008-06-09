/**
 * 
 */
package org.pentaho.ui.xul.swing;

import org.dom4j.Document;
import org.pentaho.ui.xul.XulDomContainer;
import org.pentaho.ui.xul.XulException;
import org.pentaho.ui.xul.XulLoader;
import org.pentaho.ui.xul.impl.AbstractXulLoader;

/**
 * @author nbaker
 *
 */
public class SwingXulLoader extends AbstractXulLoader implements XulLoader{

  
  
  public SwingXulLoader() throws XulException{
    super();

    //attach Renderers
    parser.registerHandler("WINDOW", "org.pentaho.ui.xul.swing.tags.SwingWindow");
    parser.registerHandler("BUTTON", "org.pentaho.ui.xul.swing.tags.SwingButton");
    parser.registerHandler("VBOX", "org.pentaho.ui.xul.swing.tags.SwingVbox");
    parser.registerHandler("HBOX", "org.pentaho.ui.xul.swing.tags.SwingHbox");
    parser.registerHandler("LABEL", "org.pentaho.ui.xul.swing.tags.SwingLabel");
    parser.registerHandler("TEXTBOX", "org.pentaho.ui.xul.swing.tags.SwingTextbox");
    parser.registerHandler("SCRIPT", "org.pentaho.ui.xul.swing.tags.SwingScript");
    parser.registerHandler("SPACER", "org.pentaho.ui.xul.swing.tags.SwingSpacer");
    parser.registerHandler("CHECKBOX", "org.pentaho.ui.xul.swing.tags.SwingCheckbox");
    parser.registerHandler("RADIO", "org.pentaho.ui.xul.swing.tags.SwingRadio");
    parser.registerHandler("RADIOGROUP", "org.pentaho.ui.xul.swing.tags.SwingRadioGroup");
    parser.registerHandler("GROUPBOX", "org.pentaho.ui.xul.swing.tags.SwingGroupbox");
    parser.registerHandler("CAPTION", "org.pentaho.ui.xul.swing.tags.SwingCaption");
    parser.registerHandler("LISTBOX", "org.pentaho.ui.xul.swing.tags.SwingListbox");
    parser.registerHandler("LISTITEM", "org.pentaho.ui.xul.swing.tags.SwingListitem");
    parser.registerHandler("MESSAGEBOX", "org.pentaho.ui.xul.swing.tags.SwingMessageBox");
    parser.registerHandler("DECK", "org.pentaho.ui.xul.swing.tags.SwingDeck");
    parser.registerHandler("MENUBAR", "org.pentaho.ui.xul.swing.tags.SwingMenubar");
    parser.registerHandler("MENU", "org.pentaho.ui.xul.swing.tags.SwingMenu");
    parser.registerHandler("MENUPOPUP", "org.pentaho.ui.xul.swing.tags.SwingMenupopup");
    parser.registerHandler("MENUITEM", "org.pentaho.ui.xul.swing.tags.SwingMenuitem");
    parser.registerHandler("MENULIST", "org.pentaho.ui.xul.swing.tags.SwingMenuList");
    parser.registerHandler("MENUSEPARATOR", "org.pentaho.ui.xul.swing.tags.SwingMenuseparator");
    parser.registerHandler("TREE", "org.pentaho.ui.xul.swing.tags.SwingTree");
    parser.registerHandler("TREECOLS", "org.pentaho.ui.xul.swing.tags.SwingTreeCols");
    parser.registerHandler("TREECOL", "org.pentaho.ui.xul.swing.tags.SwingTreeCol");
    parser.registerHandler("TREECHILDREN", "org.pentaho.ui.xul.swing.tags.SwingTreeChildren");
    parser.registerHandler("TREEITEM", "org.pentaho.ui.xul.swing.tags.SwingTreeItem");
    parser.registerHandler("TREEROW", "org.pentaho.ui.xul.swing.tags.SwingTreeRow");
    parser.registerHandler("TREECELL", "org.pentaho.ui.xul.swing.tags.SwingTreeCell");
    parser.registerHandler("SPLITTER", "org.pentaho.ui.xul.swing.tags.SwingSplitter");
    

    parser.registerHandler("TABBOX", "org.pentaho.ui.xul.swing.tags.SwingTabbox");
    parser.registerHandler("TABS", "org.pentaho.ui.xul.swing.tags.SwingTabs");
    parser.registerHandler("TAB", "org.pentaho.ui.xul.swing.tags.SwingTab");
    parser.registerHandler("TABPANELS", "org.pentaho.ui.xul.swing.tags.SwingTabpanels");
    parser.registerHandler("TABPANEL", "org.pentaho.ui.xul.swing.tags.SwingTabpanel");
    parser.registerHandler("DIALOG", "org.pentaho.ui.xul.swing.tags.SwingDialog");
    parser.registerHandler("DIALOGHEADER", "org.pentaho.ui.xul.swing.tags.SwingDialogheader");
    parser.registerHandler("PROGRESSMETER", "org.pentaho.ui.xul.swing.tags.SwingProgressmeter");
    parser.registerHandler("FILEDIALOG", "org.pentaho.ui.xul.swing.tags.SwingFileDialog");
    parser.registerHandler("STATUSBAR", "org.pentaho.ui.xul.swing.tags.SwingStatusbar");
    parser.registerHandler("STATUSBARPANEL", "org.pentaho.ui.xul.swing.tags.SwingStatusbarpanel");
    parser.registerHandler("IMAGE", "org.pentaho.ui.xul.swing.tags.SwingImage");
    

  }

  public XulLoader getNewInstance() throws XulException{
    return new SwingXulLoader();
  }
  
  @Override
  public XulDomContainer loadXul(Document xulDocument) throws IllegalArgumentException, XulException {
    return loadXul(xulDocument, null);
  }

  public XulDomContainer loadXul(Document xulDocument, Object outerContext) throws IllegalArgumentException, XulException {
    
    setOuterContext(outerContext);
    XulDomContainer domC = super.loadXul(xulDocument);
    return domC;
  }
  
}
