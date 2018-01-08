/**
	 * Scroll to the bottom of the page
	 */
	protected void scrollingToTopofAPage() {
		aLog.debug("Executed scrollingToTopofAPage");
		((JavascriptExecutor) aDriver).executeScript("window.scrollTo(0, 0)");
	}

	/**
	 * Scroll to an element on the page and center it on page if possible.
	 */
	protected void scrollToElement(By pByElement) {
		aLog.debug("Executed scrollToElement: " + pByElement);
		WebElement element = getElement(pByElement);
		Point point = element.getLocation();
		int x = point.getX();
		int y = point.getY();
		aLog.debug("Point:" + point);
		String jScript = ("window.scrollTo(" + x + "," + y + "-window.innerHeight/2);");
		((JavascriptExecutor) aDriver).executeScript(jScript);
	}

	/**
	 * Scroll to an element on the page and center it on page if possible.
	 */
	protected void scrollToElement(WebElement pWebElement) {
		aLog.debug("Executed scrollToElement: " + pWebElement);
		Point point = pWebElement.getLocation();
		int x = point.getX();
		int y = point.getY();
		aLog.debug("Point:" + point);
		String jScript = ("window.scrollTo(" + x + "," + y + "-window.innerHeight/2);");
		((JavascriptExecutor) aDriver).executeScript(jScript);
	}