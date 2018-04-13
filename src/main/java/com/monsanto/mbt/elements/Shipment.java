package com.monsanto.mbt.elements;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Shipment {

	private String shipmentBatchId;

	private Date shipmentCreationDate;

	private String shipmentStatus;

	private Date lastUpdateTime;

	private String shipmentLocation;

	private String shipmentAssignee;

	private String customerName;

	private String customerAddress;

	private long customerPhoneNumber;

	private List<Widget> widgets = new ArrayList<>();

	Shipment(String shipmentBatchId, Date shipmentCreationDate, String shipmentStatus, Date lastUpdateTime,
			String shipmentLocation, String shipmentAssignee, String customerName, String customerAddress,
			long customerPhoneNumber, List<Widget> widets) {
		this.shipmentBatchId = shipmentBatchId;
		this.shipmentCreationDate = shipmentCreationDate;
		this.shipmentStatus = shipmentStatus;
		this.lastUpdateTime = lastUpdateTime;
		this.shipmentLocation = shipmentLocation;
		this.shipmentAssignee = shipmentAssignee;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerPhoneNumber = customerPhoneNumber;
		this.widgets = widets;
	}

	Shipment(String shipmentBatchId, Date shipmentCreationDate, String shipmentStatus, Date lastUpdateTime,
			String shipmentLocation, String shipmentAssignee, String customerName, String customerAddress,
			List<Widget> widets) {
		this.shipmentBatchId = shipmentBatchId;
		this.shipmentCreationDate = shipmentCreationDate;
		this.shipmentStatus = shipmentStatus;
		this.lastUpdateTime = lastUpdateTime;
		this.shipmentLocation = shipmentLocation;
		this.shipmentAssignee = shipmentAssignee;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.widgets = widets;
	}

	public String getShipmentBatchId() {
		return shipmentBatchId;
	}

	public void setShipmentBatchId(String shipmentBatchId) {
		this.shipmentBatchId = shipmentBatchId;
	}

	public Date getShipmentCreationDate() {
		return shipmentCreationDate;
	}

	public void setShipmentCreationDate(Date shipmentCreationDate) {
		this.shipmentCreationDate = shipmentCreationDate;
	}

	public String getShipmentStatus() {
		return shipmentStatus;
	}

	public void setShipmentStatus(String shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public String getShipmentLocation() {
		return shipmentLocation;
	}

	public void setShipmentLocation(String shipmentLocation) {
		this.shipmentLocation = shipmentLocation;
	}

	public String getShipmentAssignee() {
		return shipmentAssignee;
	}

	public void setShipmentAssignee(String shipmentAssignee) {
		this.shipmentAssignee = shipmentAssignee;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public long getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(long customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public List<Widget> getWidgets() {
		return widgets;
	}

	public boolean setWidgets(List<Widget> widgets) {
		if (this.widgets.size() < 10 && (this.widgets.size() + widgets.size() < 10)) {
			this.widgets.addAll(widgets);
			return true;
		}
		return false;
	}

	public boolean setWidget(Widget widget) {
		if (this.widgets.size() < 10) {
			this.widgets.add(widget);
			return true;
		}
		return false;
	}

}
