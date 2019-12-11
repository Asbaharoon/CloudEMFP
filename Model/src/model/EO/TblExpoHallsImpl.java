package model.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Nov 30 12:28:56 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblExpoHallsImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ExpoHallsId,
        ExpoSetupId,
        HallNo,
        Name,
        TotalStalls,
        HallArea,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        TblExpoSetup,
        TblExpoStalls,
        TblStallsAlloc;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int EXPOHALLSID = AttributesEnum.ExpoHallsId.index();
    public static final int EXPOSETUPID = AttributesEnum.ExpoSetupId.index();
    public static final int HALLNO = AttributesEnum.HallNo.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int TOTALSTALLS = AttributesEnum.TotalStalls.index();
    public static final int HALLAREA = AttributesEnum.HallArea.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int TBLEXPOSETUP = AttributesEnum.TblExpoSetup.index();
    public static final int TBLEXPOSTALLS = AttributesEnum.TblExpoStalls.index();
    public static final int TBLSTALLSALLOC = AttributesEnum.TblStallsAlloc.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblExpoHallsImpl() {
    }

    /**
     * Gets the attribute value for ExpoHallsId, using the alias name ExpoHallsId.
     * @return the value of ExpoHallsId
     */
    public BigDecimal getExpoHallsId() {
        return (BigDecimal) getAttributeInternal(EXPOHALLSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExpoHallsId.
     * @param value value to set the ExpoHallsId
     */
    public void setExpoHallsId(BigDecimal value) {
        setAttributeInternal(EXPOHALLSID, value);
    }

    /**
     * Gets the attribute value for ExpoSetupId, using the alias name ExpoSetupId.
     * @return the value of ExpoSetupId
     */
    public BigDecimal getExpoSetupId() {
        return (BigDecimal) getAttributeInternal(EXPOSETUPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExpoSetupId.
     * @param value value to set the ExpoSetupId
     */
    public void setExpoSetupId(BigDecimal value) {
        setAttributeInternal(EXPOSETUPID, value);
    }

    /**
     * Gets the attribute value for HallNo, using the alias name HallNo.
     * @return the value of HallNo
     */
    public BigDecimal getHallNo() {
        return (BigDecimal) getAttributeInternal(HALLNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for HallNo.
     * @param value value to set the HallNo
     */
    public void setHallNo(BigDecimal value) {
        setAttributeInternal(HALLNO, value);
    }

    /**
     * Gets the attribute value for Name, using the alias name Name.
     * @return the value of Name
     */
    public String getName() {
        return (String) getAttributeInternal(NAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for Name.
     * @param value value to set the Name
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
    }

    /**
     * Gets the attribute value for TotalStalls, using the alias name TotalStalls.
     * @return the value of TotalStalls
     */
    public BigDecimal getTotalStalls() {
        return (BigDecimal) getAttributeInternal(TOTALSTALLS);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalStalls.
     * @param value value to set the TotalStalls
     */
    public void setTotalStalls(BigDecimal value) {
        setAttributeInternal(TOTALSTALLS, value);
    }

    /**
     * Gets the attribute value for HallArea, using the alias name HallArea.
     * @return the value of HallArea
     */
    public BigDecimal getHallArea() {
        return (BigDecimal) getAttributeInternal(HALLAREA);
    }

    /**
     * Sets <code>value</code> as the attribute value for HallArea.
     * @param value value to set the HallArea
     */
    public void setHallArea(BigDecimal value) {
        setAttributeInternal(HALLAREA, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Gets the attribute value for UpdatedBy, using the alias name UpdatedBy.
     * @return the value of UpdatedBy
     */
    public Number getUpdatedBy() {
        return (Number) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedBy.
     * @param value value to set the UpdatedBy
     */
    public void setUpdatedBy(Number value) {
        setAttributeInternal(UPDATEDBY, value);
    }

    /**
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) getAttributeInternal(UPDATEDDATE);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTblExpoSetup() {
        return (EntityImpl) getAttributeInternal(TBLEXPOSETUP);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblExpoSetup(EntityImpl value) {
        setAttributeInternal(TBLEXPOSETUP, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblExpoStalls() {
        return (RowIterator) getAttributeInternal(TBLEXPOSTALLS);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStallsAlloc() {
        return (RowIterator) getAttributeInternal(TBLSTALLSALLOC);
    }

    /**
     * @param expoHallsId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal expoHallsId) {
        return new Key(new Object[] { expoHallsId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblExpoHalls");
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        Number loginId = null;
                 try {
                     loginId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessRID"));
                 } catch(Exception ex) {
                     ex.printStackTrace();
                 }
                 
                 if (operation == DML_INSERT) {
                     setCreatedBy(loginId);
                     setUpdatedBy(loginId);
                     } else if(operation == DML_UPDATE) {
                     setUpdatedBy(loginId);
                 }
        super.doDML(operation, e);
    }
}

