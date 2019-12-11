package model.EO;

import oracle.jbo.domain.Number;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jul 31 12:09:13 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblSupplierRateDetailImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        SupplierRateDetailId,
        SupplierRateMasterId,
        ItemL4Id,
        Rate,
        Ast,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        TblItemL4,
        TblSupplierRateMaster;
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
    public static final int SUPPLIERRATEDETAILID = AttributesEnum.SupplierRateDetailId.index();
    public static final int SUPPLIERRATEMASTERID = AttributesEnum.SupplierRateMasterId.index();
    public static final int ITEML4ID = AttributesEnum.ItemL4Id.index();
    public static final int RATE = AttributesEnum.Rate.index();
    public static final int AST = AttributesEnum.Ast.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int TBLITEML4 = AttributesEnum.TblItemL4.index();
    public static final int TBLSUPPLIERRATEMASTER = AttributesEnum.TblSupplierRateMaster.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblSupplierRateDetailImpl() {
    }

    /**
     * Gets the attribute value for SupplierRateDetailId, using the alias name SupplierRateDetailId.
     * @return the value of SupplierRateDetailId
     */
    public Number getSupplierRateDetailId() {
        return (Number) getAttributeInternal(SUPPLIERRATEDETAILID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SupplierRateDetailId.
     * @param value value to set the SupplierRateDetailId
     */
    public void setSupplierRateDetailId(Number value) {
        setAttributeInternal(SUPPLIERRATEDETAILID, value);
    }

    /**
     * Gets the attribute value for SupplierRateMasterId, using the alias name SupplierRateMasterId.
     * @return the value of SupplierRateMasterId
     */
    public Number getSupplierRateMasterId() {
        return (Number) getAttributeInternal(SUPPLIERRATEMASTERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SupplierRateMasterId.
     * @param value value to set the SupplierRateMasterId
     */
    public void setSupplierRateMasterId(Number value) {
        setAttributeInternal(SUPPLIERRATEMASTERID, value);
    }

    /**
     * Gets the attribute value for ItemL4Id, using the alias name ItemL4Id.
     * @return the value of ItemL4Id
     */
    public Number getItemL4Id() {
        return (Number) getAttributeInternal(ITEML4ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemL4Id.
     * @param value value to set the ItemL4Id
     */
    public void setItemL4Id(Number value) {
        setAttributeInternal(ITEML4ID, value);
    }

    /**
     * Gets the attribute value for Rate, using the alias name Rate.
     * @return the value of Rate
     */
    public Number getRate() {
        return (Number) getAttributeInternal(RATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Rate.
     * @param value value to set the Rate
     */
    public void setRate(Number value) {
        setAttributeInternal(RATE, value);
    }

    /**
     * Gets the attribute value for Ast, using the alias name Ast.
     * @return the value of Ast
     */
    public String getAst() {
        return (String) getAttributeInternal(AST);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ast.
     * @param value value to set the Ast
     */
    public void setAst(String value) {
        setAttributeInternal(AST, value);
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
     * @return the associated entity TblItemL4Impl.
     */
    public TblItemL4Impl getTblItemL4() {
        return (TblItemL4Impl) getAttributeInternal(TBLITEML4);
    }

    /**
     * Sets <code>value</code> as the associated entity TblItemL4Impl.
     */
    public void setTblItemL4(TblItemL4Impl value) {
        setAttributeInternal(TBLITEML4, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTblSupplierRateMaster() {
        return (EntityImpl) getAttributeInternal(TBLSUPPLIERRATEMASTER);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblSupplierRateMaster(EntityImpl value) {
        setAttributeInternal(TBLSUPPLIERRATEMASTER, value);
    }

    /**
     * @param supplierRateDetailId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number supplierRateDetailId) {
        return new Key(new Object[] { supplierRateDetailId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblSupplierRateDetail");
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

