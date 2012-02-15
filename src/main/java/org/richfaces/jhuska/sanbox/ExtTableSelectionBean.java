package org.richfaces.jhuska.sanbox;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;

import org.richfaces.component.UIExtendedDataTable;
import org.richfaces.jhuska.sanbox.model.cars.InventoryItem;

@ManagedBean
@ViewScoped
public class ExtTableSelectionBean implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 133232;
	private String selectionMode = "multiple";
    private Collection<Object> selection;
    @ManagedProperty(value = "#{carsBean.allInventoryItems}")
    private List<InventoryItem> inventoryItems;
    private List<InventoryItem> selectionItems = new ArrayList<InventoryItem>();

    public void selectionListener(AjaxBehaviorEvent event) {
    	System.out.println("###################The JSF implementation has version: " + FacesContext.class.getPackage().getImplementationVersion() );
    	
    	UIExtendedDataTable dataTable = (UIExtendedDataTable) event.getComponent();
        Object originalKey = dataTable.getRowKey();
        selectionItems.clear();
        for (Object selectionKey : selection) {
            dataTable.setRowKey(selectionKey);
            if (dataTable.isRowAvailable()) {
                selectionItems.add((InventoryItem) dataTable.getRowData());
            }
        }
        dataTable.setRowKey(originalKey);
    }

    public Collection<Object> getSelection() {
        return selection;
    }

    public void setSelection(Collection<Object> selection) {
        this.selection = selection;
    }

    public List<InventoryItem> getInventoryItems() {
        return inventoryItems;
    }

    public void setInventoryItems(List<InventoryItem> inventoryItems) {
        this.inventoryItems = inventoryItems;
    }

    public InventoryItem getSelectionItem() {
        if (selectionItems == null || selectionItems.isEmpty()) {
            return null;
        }
        return selectionItems.get(0);
    }

    public List<InventoryItem> getSelectionItems() {
        return selectionItems;
    }

    public void setSelectionItems(List<InventoryItem> selectionItems) {
        this.selectionItems = selectionItems;
    }

    public String getSelectionMode() {
        return selectionMode;
    }

    public void setSelectionMode(String selectionMode) {
        this.selectionMode = selectionMode;
    }
}
