package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the request_history database table.
 * 
 */
@Entity
@Table(name="request_history")
@NamedQuery(name="RequestHistory.findAll", query="SELECT r FROM RequestHistory r")
public class RequestHistory implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String address;
	private double bill;
	private Integer copies;
	private Timestamp date;
	private Boolean manual;
	private String name;
	private String postcode;
	private Boolean processed;
	private Date reminder;
	private String serial;
	private Boolean shipped;
	private String track;
	private String tracker;
	private Set<Blockage> blockages;
	private Set<RequestChange> requestChanges;
	private RequestBatch requestBatch;
	private RequestPassport requestPassport;
	private RequestType requestType;
	private ShippingContinent shippingContinent;
	private ShippingMode shippingMode;
	private Set<RequestLog> requestLogs;
	private Set<RequestMap> requestMaps;

	public RequestHistory() {
	}


	@Id
	@SequenceGenerator(name="REQUEST_HISTORY_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REQUEST_HISTORY_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(nullable=false, length=1024)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public double getBill() {
		return this.bill;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}


	@Column(nullable=false)
	public Integer getCopies() {
		return this.copies;
	}

	public void setCopies(Integer copies) {
		this.copies = copies;
	}


	@Column(nullable=false)
	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}


	@Column(nullable=false)
	public Boolean getManual() {
		return this.manual;
	}

	public void setManual(Boolean manual) {
		this.manual = manual;
	}


	@Column(nullable=false, length=1024)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Column(length=1024)
	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}


	@Column(nullable=false)
	public Boolean getProcessed() {
		return this.processed;
	}

	public void setProcessed(Boolean processed) {
		this.processed = processed;
	}


	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	public Date getReminder() {
		return this.reminder;
	}

	public void setReminder(Date reminder) {
		this.reminder = reminder;
	}


	@Column(length=1024)
	public String getSerial() {
		return this.serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}


	@Column(nullable=false)
	public Boolean getShipped() {
		return this.shipped;
	}

	public void setShipped(Boolean shipped) {
		this.shipped = shipped;
	}


	@Column(length=1024)
	public String getTrack() {
		return this.track;
	}

	public void setTrack(String track) {
		this.track = track;
	}


	@Column(length=1024)
	public String getTracker() {
		return this.tracker;
	}

	public void setTracker(String tracker) {
		this.tracker = tracker;
	}


	//bi-directional many-to-one association to Blockage
	@OneToMany(mappedBy="requestHistory")
	public Set<Blockage> getBlockages() {
		return this.blockages;
	}

	public void setBlockages(Set<Blockage> blockages) {
		this.blockages = blockages;
	}

	public Blockage addBlockage(Blockage blockage) {
		getBlockages().add(blockage);
		blockage.setRequestHistory(this);

		return blockage;
	}

	public Blockage removeBlockage(Blockage blockage) {
		getBlockages().remove(blockage);
		blockage.setRequestHistory(null);

		return blockage;
	}


	//bi-directional many-to-one association to RequestChange
	@OneToMany(mappedBy="requestHistory")
	public Set<RequestChange> getRequestChanges() {
		return this.requestChanges;
	}

	public void setRequestChanges(Set<RequestChange> requestChanges) {
		this.requestChanges = requestChanges;
	}

	public RequestChange addRequestChange(RequestChange requestChange) {
		getRequestChanges().add(requestChange);
		requestChange.setRequestHistory(this);

		return requestChange;
	}

	public RequestChange removeRequestChange(RequestChange requestChange) {
		getRequestChanges().remove(requestChange);
		requestChange.setRequestHistory(null);

		return requestChange;
	}


	//bi-directional many-to-one association to RequestBatch
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="request_batch_fk")
	public RequestBatch getRequestBatch() {
		return this.requestBatch;
	}

	public void setRequestBatch(RequestBatch requestBatch) {
		this.requestBatch = requestBatch;
	}


	//bi-directional many-to-one association to RequestPassport
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="request_passport_fk", nullable=false)
	public RequestPassport getRequestPassport() {
		return this.requestPassport;
	}

	public void setRequestPassport(RequestPassport requestPassport) {
		this.requestPassport = requestPassport;
	}


	//bi-directional many-to-one association to RequestType
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="request_type_fk", nullable=false)
	public RequestType getRequestType() {
		return this.requestType;
	}

	public void setRequestType(RequestType requestType) {
		this.requestType = requestType;
	}


	//bi-directional many-to-one association to ShippingContinent
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="shipping_continent_fk")
	public ShippingContinent getShippingContinent() {
		return this.shippingContinent;
	}

	public void setShippingContinent(ShippingContinent shippingContinent) {
		this.shippingContinent = shippingContinent;
	}


	//bi-directional many-to-one association to ShippingMode
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="shipping_mode_fk")
	public ShippingMode getShippingMode() {
		return this.shippingMode;
	}

	public void setShippingMode(ShippingMode shippingMode) {
		this.shippingMode = shippingMode;
	}


	//bi-directional many-to-one association to RequestLog
	@OneToMany(mappedBy="requestHistory")
	public Set<RequestLog> getRequestLogs() {
		return this.requestLogs;
	}

	public void setRequestLogs(Set<RequestLog> requestLogs) {
		this.requestLogs = requestLogs;
	}

	public RequestLog addRequestLog(RequestLog requestLog) {
		getRequestLogs().add(requestLog);
		requestLog.setRequestHistory(this);

		return requestLog;
	}

	public RequestLog removeRequestLog(RequestLog requestLog) {
		getRequestLogs().remove(requestLog);
		requestLog.setRequestHistory(null);

		return requestLog;
	}


	//bi-directional many-to-one association to RequestMap
	@OneToMany(mappedBy="requestHistory")
	public Set<RequestMap> getRequestMaps() {
		return this.requestMaps;
	}

	public void setRequestMaps(Set<RequestMap> requestMaps) {
		this.requestMaps = requestMaps;
	}

	public RequestMap addRequestMap(RequestMap requestMap) {
		getRequestMaps().add(requestMap);
		requestMap.setRequestHistory(this);

		return requestMap;
	}

	public RequestMap removeRequestMap(RequestMap requestMap) {
		getRequestMaps().remove(requestMap);
		requestMap.setRequestHistory(null);

		return requestMap;
	}

}