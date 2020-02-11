package com.douzone.mysite.action.main;

import com.douzone.web.action.Action;
import com.douzone.web.action.ActionFactory;

public class MainActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		return new MainAction();
	}

}
