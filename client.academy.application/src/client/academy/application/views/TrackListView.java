package client.academy.application.views;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import model.BewegungsdatenModel;

public class TrackListView extends ViewPart {
	private TableViewer viewer;
	
	public TrackListView() {
	}

	@Override
	public void createPartControl(Composite parent) {
		BewegungsdatenModel dataModel = new BewegungsdatenModel();
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.getTable().setLinesVisible(true);

		TableViewerColumn column = new TableViewerColumn(viewer, SWT.NONE);
		column.setLabelProvider(new ColumnLabelProvider());

		viewer.getTable().getColumn(0).setWidth(200);
		
		viewer.setContentProvider(ArrayContentProvider.getInstance());
		
		// Provide the input to the ContentProvider
		viewer.setInput(dataModel.getTracks());
		
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
