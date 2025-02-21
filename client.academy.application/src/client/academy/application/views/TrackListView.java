package client.academy.application.views;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import client.academy.application.model.*;

public class TrackListView extends ViewPart {
	private TableViewer viewer;
	
	public TrackListView() {
	}

	@Override
	public void createPartControl(Composite parent) {
//		BewegungsdatenModel dataModel = new BewegungsdatenModel();
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.getTable().setLinesVisible(true);

		TableViewerColumn column = new TableViewerColumn(viewer, SWT.NONE);
		column.setLabelProvider(new ColumnLabelProvider());

		viewer.getTable().getColumn(0).setWidth(200);
		
		viewer.setContentProvider(ArrayContentProvider.getInstance());
		
		// Provide the input to the ContentProvider
		viewer.setInput(this.getBewegungsdatenModel());
		
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}
	
	private List<String> getBewegungsdatenModel() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] elements = registry.getConfigurationElementsFor("client.academy.application.bewegungsdatenprovider");
		try {
			BewegungsdatenModel dataModel  = (BewegungsdatenModel)elements[0].createExecutableExtension("dataprovider");
			return dataModel.getTracks();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

}
