/**
 * IWebServerSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */
package tier1.skeleton;

/**
 *  IWebServerSkeletonInterface java skeleton interface for the axisService
 */
public interface IWebServerSkeletonInterface {
    /**
     * Auto generated method signature
     *
     * @param addProductContent
     */
    public void addProductContent(tier2.AddProductContent addProductContent);

    /**
     * Auto generated method signature
     *
     * @param registerTray
     */
    public void registerTray(tier2.RegisterTray registerTray);

    /**
     * Auto generated method signature
     *
     * @param registerAnimal
     */
    public void registerAnimal(tier2.RegisterAnimal registerAnimal);

    /**
     * Auto generated method signature
     *
     * @param getInfectedProducts
     */
    public tier2.GetInfectedProductsResponse getInfectedProducts(
        tier2.GetInfectedProducts getInfectedProducts);

    /**
     * Auto generated method signature
     *
     * @param registerProduct
     */
    public void registerProduct(tier2.RegisterProduct registerProduct);

    /**
     * Auto generated method signature
     *
     * @param addTrayContent
     */
    public void addTrayContent(tier2.AddTrayContent addTrayContent);
}
