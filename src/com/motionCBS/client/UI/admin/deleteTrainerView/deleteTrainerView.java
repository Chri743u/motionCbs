package com.motionCBS.client.UI.admin.deleteTrainerView;

import com.google.gwt.cell.client.ActionCell;
import com.google.gwt.cell.client.NumberCell;
import com.google.gwt.cell.client.TextCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.ColumnSortEvent;
import com.google.gwt.user.cellview.client.DataGrid;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.view.client.ListDataProvider;
import com.motionCBS.Shared.User;

import java.util.Comparator;

public class DeleteTrainerView extends Composite {

    private static deleteTrainerViewUiBinder ourUiBinder = GWT.create(deleteTrainerViewUiBinder.class);

    @UiField
    DataGrid<User> dataGrid;
    @UiField
    SimplePager pager;

    private ActionCell.Delegate<User> actionCell;

    interface deleteTrainerViewUiBinder extends UiBinder<HTMLPanel, DeleteTrainerView> {
    }

    public DeleteTrainerView() {
        initWidget(ourUiBinder.createAndBindUi(this));

        dataGrid.setPageSize(25);

        pager.setDisplay(dataGrid);

        dataGrid.setAutoHeaderRefreshDisabled(true);
    }
    public void initUsersTable(ListDataProvider<User> dataProvider) {
        // Attach a column sort handler to the ListDataProvider to sort the list
        ColumnSortEvent.ListHandler<User> sortHandler = new ColumnSortEvent.ListHandler<User>(dataProvider.getList());
        dataGrid.addColumnSortHandler(sortHandler);

        // Creating all the necessary columns to the table
        initTableColumns(sortHandler);

        /*
         * Adding the data grid to the DataProvider The DataPrivider is
         * containing a List with all the data
         */
        dataProvider.addDataDisplay(dataGrid);
    }

    private void initTableColumns(ColumnSortEvent.ListHandler<User> sortHandler) {
        Column<User, Number> userIdColumn = new Column<User, Number>(new NumberCell()) {
            @Override
            public Number getValue(User object) {
                return object.getId();
            }
        };
        // Setting the user id column to sortable
        userIdColumn.setSortable(true);
        sortHandler.setComparator(userIdColumn, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return Integer.compare(u1.getId(), u2.getId());
            }
        });
        // Adding the column to the table. The "User id" is the title of the column
        dataGrid.addColumn(userIdColumn, "Trainer id");
        // Setting the size of the column.
        dataGrid.setColumnWidth(userIdColumn, 7, Style.Unit.PX);


        // Firstname
        Column<User, String> fnameColumn = new Column<User, String>(new TextCell()) {
            @Override
            public String getValue(User user) {
                return user.getFname();
            }
        };
        fnameColumn.setSortable(true);
        sortHandler.setComparator(fnameColumn, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return u1.getFname().compareTo(u2.getFname());
            }
        });

        dataGrid.addColumn(fnameColumn, "Firstname");
        dataGrid.setColumnWidth(fnameColumn, 7, Style.Unit.PX);

        // Lastname
        Column<User, String> lnameColumn = new Column<User, String>(new TextCell()) {
            @Override
            public String getValue(User user) {
                return user.getLname();}
        };
        lnameColumn.setSortable(true);
        sortHandler.setComparator(lnameColumn, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return u1.getLname().compareTo(u2.getLname());
            }
        });

        dataGrid.addColumn(lnameColumn, "Lastname");
        dataGrid.setColumnWidth(lnameColumn, 7, Style.Unit.PX);

        // Mobile
        Column<User, Number> mobileColumn = new Column<User, Number>(new NumberCell()) {
            @Override
            public Number getValue(User user) {
                return user.getMobilenr();}
        };
        mobileColumn.setSortable(true);
        sortHandler.setComparator(mobileColumn, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return Integer.compare(u1.getMobilenr(), u2.getMobilenr());}
        });

        //Teamtype


        //Delete user button
        ActionCell<User> deleteUserCell = new ActionCell<>("Delete User", actionCell);
        Column<User, User> joinColumn = new Column<User, User>(deleteUserCell) {
            @Override
            public User getValue(User user) {
                return user;
            }
        };

        dataGrid.addColumn(joinColumn, "Delete");
        dataGrid.setColumnWidth(joinColumn, 7, Style.Unit.PX);
    }

    public void addClickHandler(ActionCell.Delegate<User> actionCell) {
        this.actionCell = actionCell;
    }
}