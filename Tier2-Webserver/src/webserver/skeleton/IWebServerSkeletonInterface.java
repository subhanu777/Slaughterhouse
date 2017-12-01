/**
 * IWebServerSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */
package webserver.skeleton;


/**
 *  IWebServerSkeletonInterface java skeleton interface for the axisService
 */
public interface IWebServerSkeletonInterface {
    /**
     * Auto generated method signature
     *
     * @param registerProduct
     */
    public void registerProduct(webserver.RegisterProduct registerProduct);

    /**
     * Auto generated method signature
     *
     * @param addTrayContent
     */
    public void addTrayContent(webserver.AddTrayContent addTrayContent);

    /**
     * Auto generated method signature
     *
     * @param registerTray
     */
    public void registerTray(webserver.RegisterTray registerTray);

    /**
     * Auto generated method signature
     *
     * @param registerAnimal
     */
    public void registerAnimal(webserver.RegisterAnimal registerAnimal);

    /**
     * Auto generated method signature
     *
     * @param getInfectedProducts
     */
    public webserver.GetInfectedProductsResponse getInfectedProducts(
        webserver.GetInfectedProducts getInfectedProducts);

    /**
     * Auto generated method signature
     *
     * @param addProductContent
     */
    public void addProductContent(webserver.AddProductContent addProductContent);
}
