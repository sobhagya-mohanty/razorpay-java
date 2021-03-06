package com.razorpay;

public class AddonClient extends ApiClient {

  AddonClient(String auth) {
    super(auth);
  }

  // To create an Addon, use the createAddon method of SubscriptionClient
  public Addon fetch(String id) throws RazorpayException {
    return get(String.format(Constants.ADDON_GET, id), null);
  }

  public Addon delete(String id) throws RazorpayException {
    return delete(String.format(Constants.ADDON_DELETE, id), null);
  }
}
