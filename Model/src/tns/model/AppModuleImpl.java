package tns.model.AM;

import oracle.jbo.server.ApplicationModuleImpl;

import oracle.jbo.server.ViewObjectImpl;

import tns.model.VO.VO_CustomersImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Sep 17 17:03:40 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleImpl() {
    }


    /**
     * Container's getter for VO_Clients1.
     * @return VO_Clients1
     */
    public ViewObjectImpl getVO_Clients1() {
        return (ViewObjectImpl)findViewObject("VO_Clients1");
    }

    /**
     * Container's getter for VO_Customers1.
     * @return VO_Customers1
     */
    public ViewObjectImpl getVO_Customers1() {
        return (ViewObjectImpl)findViewObject("VO_Customers1");
    }

    /**
     * Container's getter for VO_Suppliers1.
     * @return VO_Suppliers1
     */
    public ViewObjectImpl getVO_Suppliers1() {
        return (ViewObjectImpl)findViewObject("VO_Suppliers1");
    }
}
