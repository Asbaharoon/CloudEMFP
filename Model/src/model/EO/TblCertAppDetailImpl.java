package model.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Nov 30 11:42:58 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblCertAppDetailImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CertAppMasterId,
        CertAppDetailId,
        CropId,
        ProdQty,
        ExportQty,
        ExportAmount,
        MarketServ,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        TblCertAppMaster;
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


    public static final int CERTAPPMASTERID = AttributesEnum.CertAppMasterId.index();
    public static final int CERTAPPDETAILID = AttributesEnum.CertAppDetailId.index();
    public static final int CROPID = AttributesEnum.CropId.index();
    public static final int PRODQTY = AttributesEnum.ProdQty.index();
    public static final int EXPORTQTY = AttributesEnum.ExportQty.index();
    public static final int EXPORTAMOUNT = AttributesEnum.ExportAmount.index();
    public static final int MARKETSERV = AttributesEnum.MarketServ.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int TBLCERTAPPMASTER = AttributesEnum.TblCertAppMaster.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblCertAppDetailImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblCertAppDetail");
    }


    /**
     * Gets the attribute value for CertAppMasterId, using the alias name CertAppMasterId.
     * @return the value of CertAppMasterId
     */
    public BigDecimal getCertAppMasterId() {
        return (BigDecimal) getAttributeInternal(CERTAPPMASTERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CertAppMasterId.
     * @param value value to set the CertAppMasterId
     */
    public void setCertAppMasterId(BigDecimal value) {
        setAttributeInternal(CERTAPPMASTERID, value);
    }

    /**
     * Gets the attribute value for CertAppDetailId, using the alias name CertAppDetailId.
     * @return the value of CertAppDetailId
     */
    public BigDecimal getCertAppDetailId() {
        return (BigDecimal) getAttributeInternal(CERTAPPDETAILID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CertAppDetailId.
     * @param value value to set the CertAppDetailId
     */
    public void setCertAppDetailId(BigDecimal value) {
        setAttributeInternal(CERTAPPDETAILID, value);
    }

    /**
     * Gets the attribute value for CropId, using the alias name CropId.
     * @return the value of CropId
     */
    public BigDecimal getCropId() {
        return (BigDecimal) getAttributeInternal(CROPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CropId.
     * @param value value to set the CropId
     */
    public void setCropId(BigDecimal value) {
        setAttributeInternal(CROPID, value);
    }

    /**
     * Gets the attribute value for ProdQty, using the alias name ProdQty.
     * @return the value of ProdQty
     */
    public BigDecimal getProdQty() {
        return (BigDecimal) getAttributeInternal(PRODQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProdQty.
     * @param value value to set the ProdQty
     */
    public void setProdQty(BigDecimal value) {
        setAttributeInternal(PRODQTY, value);
    }

    /**
     * Gets the attribute value for ExportQty, using the alias name ExportQty.
     * @return the value of ExportQty
     */
    public BigDecimal getExportQty() {
        return (BigDecimal) getAttributeInternal(EXPORTQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExportQty.
     * @param value value to set the ExportQty
     */
    public void setExportQty(BigDecimal value) {
        setAttributeInternal(EXPORTQTY, value);
    }

    /**
     * Gets the attribute value for ExportAmount, using the alias name ExportAmount.
     * @return the value of ExportAmount
     */
    public BigDecimal getExportAmount() {
        return (BigDecimal) getAttributeInternal(EXPORTAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExportAmount.
     * @param value value to set the ExportAmount
     */
    public void setExportAmount(BigDecimal value) {
        setAttributeInternal(EXPORTAMOUNT, value);
    }

    /**
     * Gets the attribute value for MarketServ, using the alias name MarketServ.
     * @return the value of MarketServ
     */
    public String getMarketServ() {
        return (String) getAttributeInternal(MARKETSERV);
    }

    /**
     * Sets <code>value</code> as the attribute value for MarketServ.
     * @param value value to set the MarketServ
     */
    public void setMarketServ(String value) {
        setAttributeInternal(MARKETSERV, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
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
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) getAttributeInternal(UPDATEDDATE);
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
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTblCertAppMaster() {
        return (EntityImpl) getAttributeInternal(TBLCERTAPPMASTER);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblCertAppMaster(EntityImpl value) {
        setAttributeInternal(TBLCERTAPPMASTER, value);
    }


    /**
     * @param certAppDetailId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal certAppDetailId) {
        return new Key(new Object[] { certAppDetailId });
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

