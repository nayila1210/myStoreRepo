package com.myStore.smokeTest;

import org.testng.annotations.Test;

import com.myStore.mainPage.AddressPage;
import com.myStore.mainPage.MyStoreHomePage;
import com.myStore.mainPage.OrderConfirmationPage;
import com.myStore.mainPage.OrderHistorryPage;
import com.myStore.mainPage.PaymentPage;
import com.myStore.mainPage.PaymentSummaryPage;
import com.myStore.mainPage.ShippingPage;
import com.myStore.mainPage.SignInPage;
import com.myStore.mainPage.SummaryPage;
import com.myStore.womenPage.PrintedChiffonDressPage;
import com.myStore.womenPage.WomenMainPage;
import com.myStore.womenPage.YourAddressPage;
import com.selenium.Nayilalibrary.BasePage;

import jxl.common.Logger;

public class WomenPageShoppingFunctionalityTest extends BasePage {

	final static Logger logger = Logger.getLogger(WomenPageShoppingFunctionalityTest.class);
	MyStoreHomePage myStoreHomePage = new MyStoreHomePage();
	WomenMainPage myWomenMainPage = new WomenMainPage();
	PrintedChiffonDressPage myPfDressPage = new PrintedChiffonDressPage();
	SummaryPage mySummaryPage = new SummaryPage();
	SignInPage mySigInPage = new SignInPage();
	AddressPage myAddressPage = new AddressPage();
	ShippingPage myShippingPage = new ShippingPage();
	PaymentPage myPaymentPage = new PaymentPage();
	PaymentSummaryPage myPaymentSummaryPage = new PaymentSummaryPage();
	OrderConfirmationPage myOrderConfirmationPage = new OrderConfirmationPage();
	YourAddressPage myYourAddressPage = new YourAddressPage();
	OrderHistorryPage myOrderHistoryPage = new OrderHistorryPage();

	@Test(enabled = false)
	public void verifyShoppingFilterByPriceFunction() throws Exception {
		logger.info("Test Case 3.1 Is Really Starting!");
		myStoreHomePage.goto_MyStoreSite();
		myStoreHomePage.click_OnWomenLink();
		myWomenMainPage.wait_ForPageLoadComplete();
		myWomenMainPage.select_OnFilter();
		myWomenMainPage.scroll_DownWindow();
		myWomenMainPage.compare_ItemPrice();
		logger.info("Test Case 3.1 Is Ending!");

	}

	@Test(enabled = false)
	public void verifyWomenPageShoppingFunction() throws Exception {
		logger.info("Test Case 3.2 Is Starting!");
		myStoreHomePage.goto_MyStoreSite();
		myStoreHomePage.click_OnWomenLink();
		myWomenMainPage.wait_ForPageLoadComplete();
		myWomenMainPage.select_OnFilter();
		myWomenMainPage.scroll_DownWindow();
		myWomenMainPage.click_OnLowestItem();
		myPfDressPage.wait_ForPageLoadComplete();
		myPfDressPage.click_OnAddToChart();
		myStoreHomePage.verify_AddTOCartSuccess("Printed Chiffon Dress");
		myStoreHomePage.click_OnProceedToCheckOut();
		mySummaryPage.wait_ForSummaryPageLoad();
		mySummaryPage.click_OnCheckOutBtn();
		mySigInPage.wait_ForPageLoadComplete();
		mySigInPage.enter_UserNameAndPassW();
		mySigInPage.click_OnSignIn();
		myAddressPage.wait_ForPageLoadComplete();
		myAddressPage.verify_personalInfo();
		myAddressPage.click_OnPreceedToCheckOutBtn();
		myShippingPage.wait_ForShippingPageLoad();
		myShippingPage.click_OnTermOfService();
		myShippingPage.click_OnPreceedToCheckOutBtn();
		myPaymentPage.waitUntilPageLoadComplete();
		myPaymentPage.click_OnBankWire();
		myPaymentSummaryPage.wait_UntilPageLoadComplete();
		myPaymentSummaryPage.click_OnConfirMyOrder();
		myOrderConfirmationPage.wait_UntilPageLoadComplete();
		logger.info("Test Case 3.2 Is Ending!");

	}

	@Test(enabled = false)
	public void verifyUpdateAddressFunction() throws Exception {
		logger.info("Test Case 3.3 Is Starting!");
		myStoreHomePage.goto_MyStoreSite();
		myStoreHomePage.click_OnWomenLink();
		myWomenMainPage.wait_ForPageLoadComplete();
		myWomenMainPage.select_OnFilter();
		myWomenMainPage.scroll_DownWindow();
		myWomenMainPage.click_OnLowestItem();
		myPfDressPage.wait_ForPageLoadComplete();
		myPfDressPage.click_OnAddToChart();
		myStoreHomePage.verify_AddTOCartSuccess("Printed Chiffon Dress");
		myStoreHomePage.click_OnProceedToCheckOut();
		mySummaryPage.wait_ForSummaryPageLoad();
		mySummaryPage.click_OnCheckOutBtn();
		mySigInPage.wait_ForPageLoadComplete();
		mySigInPage.enter_UserNameAndPassW();
		mySigInPage.click_OnSignIn();
		myAddressPage.wait_ForPageLoadComplete();
		myAddressPage.verify_personalInfo();
		myAddressPage.click_OnDeliveryAddressUpdate();
		myYourAddressPage.wait_ForPageLoadComplete();
		myYourAddressPage.edit_AddressOne();
		myYourAddressPage.click_OnSaveBtn();
		myAddressPage.wait_ForPageLoadComplete();
		myAddressPage.verify_UpdatedpersonalInfo();
		logger.info("Test Case 3.3 Is Ending!");

	}

	@Test(enabled = false)
	public void verifyAddNewAddressFunction() throws Exception {
		logger.info("Test Case 3.4 Is Starting!");
		myStoreHomePage.goto_MyStoreSite();
		myStoreHomePage.click_OnWomenLink();
		myWomenMainPage.wait_ForPageLoadComplete();
		myWomenMainPage.select_OnFilter();
		myWomenMainPage.scroll_DownWindow();
		myWomenMainPage.click_OnLowestItem();
		myPfDressPage.wait_ForPageLoadComplete();
		myPfDressPage.click_OnAddToChart();
		myStoreHomePage.verify_AddTOCartSuccess("Printed Chiffon Dress");
		myStoreHomePage.click_OnProceedToCheckOut();
		mySummaryPage.wait_ForSummaryPageLoad();
		mySummaryPage.click_OnCheckOutBtn();
		mySigInPage.wait_ForPageLoadComplete();
		mySigInPage.enter_UserNameAndPassW();
		mySigInPage.click_OnSignIn();
		myAddressPage.wait_ForPageLoadComplete();
		myAddressPage.verify_UpdatedpersonalInfo();
		myAddressPage.click_OnAddingNewAddress();
		myYourAddressPage.wait_ForPageLoadComplete();
		myYourAddressPage.add_NewAddress();
		myYourAddressPage.click_OnSaveBtn();
		myAddressPage.wait_ForPageLoadComplete();
		myAddressPage.select_Allias();
		myAddressPage.verify_NewPersonalInfo();
		logger.info("Test Case 3.4 Is Ending!");

	}

	@Test(enabled = false)
	public void verifyReorderFunction() throws Exception {
		logger.info("Test Case 3.5 Is Starting!");
		myStoreHomePage.goto_MyStoreSite();
		myStoreHomePage.click_OnWomenLink();
		myWomenMainPage.wait_ForPageLoadComplete();
		myWomenMainPage.select_OnFilter();
		myWomenMainPage.scroll_DownWindow();
		myWomenMainPage.click_OnLowestItem();
		myPfDressPage.wait_ForPageLoadComplete();
		myPfDressPage.click_OnAddToChart();
		myStoreHomePage.verify_AddTOCartSuccess("Printed Chiffon Dress");
		myStoreHomePage.click_OnProceedToCheckOut();
		mySummaryPage.wait_ForSummaryPageLoad();
		mySummaryPage.click_OnCheckOutBtn();
		mySigInPage.wait_ForPageLoadComplete();
		mySigInPage.enter_UserNameAndPassW();
		mySigInPage.click_OnSignIn();
		myAddressPage.wait_ForPageLoadComplete();
		myAddressPage.verify_personalInfo();
		myAddressPage.click_OnPreceedToCheckOutBtn();
		myShippingPage.wait_ForShippingPageLoad();
		myShippingPage.click_OnTermOfService();
		myShippingPage.click_OnPreceedToCheckOutBtn();
		myPaymentPage.waitUntilPageLoadComplete();
		myPaymentPage.click_OnBankWire();
		myPaymentSummaryPage.wait_UntilPageLoadComplete();
		myPaymentSummaryPage.click_OnConfirMyOrder();
		myOrderConfirmationPage.wait_UntilPageLoadComplete();
		myOrderConfirmationPage.click_OnBacktoOrder();
		myOrderHistoryPage.wait_UntilPageLoadComplete();
		myOrderHistoryPage.click_OnReorder();
		mySummaryPage.wait_ForSummaryPageLoad();
		mySummaryPage.click_OnDeleteBtn();
		mySummaryPage.verify_OnDeleteBtn();
		logger.info("Test Case 3.5 Is Ending!");

	}
}