package com.douzone.mysite.action.user;

import com.douzone.mysite.action.main.MainAction;
import com.douzone.web.action.Action;
import com.douzone.web.action.ActionFactory;

public class UserActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		switch(actionName) {
			case "joinform" : return new JoinFormAction();
			case "join" : return new JoinAction();
			case "joinsuccess" : return new JoinSuccessAction();
			case "loginform" : return new LoginFormAction();
			case "login" : return new LoginAction();
			case "logout" : return new LogoutAction();
			case "updateform" : return new UpdateFormAction();
			default : return new MainAction();
		}
	}

}
