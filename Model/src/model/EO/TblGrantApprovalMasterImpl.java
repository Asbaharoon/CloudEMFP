package model.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jul 31 12:39:20 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblGrantApprovalMasterImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        GrantApprovalMasterId,
        ClusterId,
        Dated,
        Status,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        TblGrantApprovalDetail,
        TblCluster,
        TblGrantDisburseMaster;
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
    public static final int GRANTAPPROVALMASTERID = AttributesEnum.GrantApprovalMasterId.index();
    public static final int CLUSTERID = AttributesEnum.ClusterId.index();
    public static final int DATED = AttributesEnum.Dated.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int TBLGRANTAPPROVALDETAIL = AttributesEnum.TblGrantApprovalDetail.index();
    public static final int TBLCLUSTER = AttributesEnum.TblCluster.index();
    public static final int TBLGRANTDISBURSEMASTER = AttributesEnum.TblGrantDisburseMaster.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblGrantApprovalMasterImpl() {
    }

    /**
     * Gets the attribute value for GrantApprovalMasterId, using the alias name GrantApprovalMasterId.
     * @return the value of GrantApprovalMasterId
     */
    public BigDecimal getGrantApprovalMasterId() {
        return (BigDecimal) getAttributeInternal(GRANTAPPROVALMASTERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GrantApprovalMasterId.
     * @param value value to set the GrantApprovalMasterId
     */
    public void setGrantApprovalMasterId(BigDecimal value) {
        setAttributeInternal(GRANTAPPROVALMASTERID, value);
    }

    /**
     * Gets the attribute value for ClusterId, using the alias name ClusterId.
     * @return the value of ClusterId
     */
    public BigDecimal getClusterId() {
        return (BigDecimal) getAttributeInternal(CLUSTERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ClusterId.
     * @param value value to set the ClusterId
     */
    public void setClusterId(BigDecimal value) {
        setAttributeInternal(CLUSTERID, value);
    }

    /**
     * Gets the attribute value for Dated, using the alias name Dated.
     * @return the value of Dated
     */
    public Timestamp getDated() {
        return (Timestamp) getAttributeInternal(DATED);
    }

    /**
     * Sets <code>value</code> as the attribute value for Dated.
     * @param value value to set the Dated
     */
    public void setDated(Timestamp value) {
        setAttributeInternal(DATED, value);
    }

    /**
     * Gets the attribute value for Status, using the alias name Status.
     * @return the value of Status
     */
    public BigDecimal getStatus() {
        return (BigDecimal) getAttributeInternal(STATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Status.
     * @param value value to set the Status
     */
    public void setStatus(BigDecimal value) {
        setAttributeInternal(STATUS, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public BigDecimal getCreatedBy() {
        return (BigDecimal) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(BigDecimal value) {
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
    public BigDecimal getUpdatedBy() {
        return (BigDecimal) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedBy.
     * @param value value to set the UpdatedBy
     */
    public void setUpdatedBy(BigDecimal value) {
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblGrantApprovalDetail() {
        return (RowIterator) getAttributeInternal(TBLGRANTAPPROVALDETAIL);
    }

    /**
     * @return the associated entity TblClusterImpl.
     */
    public TblClusterImpl getTblCluster() {
        return (TblClusterImpl) getAttributeInternal(TBLCLUSTER);
    }

    /**
     * Sets <code>value</code> as the associated entity TblClusterImpl.
     */
    public void setTblCluster(TblClusterImpl value) {
        setAttributeInternal(TBLCLUSTER, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblGrantDisburseMaster() {
        return (RowIterator) getAttributeInternal(TBLGRANTDISBURSEMASTER);
    }

    /**
     * @param grantApprovalMasterId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal grantApprovalMasterId) {
        return new Key(new Object[] { grantApprovalMasterId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblGrantApprovalMaster");
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
        BigDecimal loginId = null;
         try {
             loginId = new BigDecimal((String) ADFContext.getCurrent().getSessionScope().get("sessUID"));
         } catch(Exception ex) {
             ex.printStackTrace();
         }
         
         if (operation == DML_INSERT) {
             setCreatedBy(loginId);
             setUpdatedBy(loginId);
         } else {
             setUpdatedBy(loginId);
         }
        super.doDML(operation, e);
    }
}

