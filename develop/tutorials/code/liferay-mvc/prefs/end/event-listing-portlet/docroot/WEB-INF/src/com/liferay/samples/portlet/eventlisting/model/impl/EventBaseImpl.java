/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.liferay.samples.portlet.eventlisting.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.liferay.samples.portlet.eventlisting.model.Event;
import com.liferay.samples.portlet.eventlisting.service.EventLocalServiceUtil;

/**
 * The extended model base implementation for the Event service. Represents a row in the &quot;Event&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EventImpl}.
 * </p>
 *
 * @author Joe Bloggs
 * @see EventImpl
 * @see com.liferay.samples.portlet.eventlisting.model.Event
 * @generated
 */
public abstract class EventBaseImpl extends EventModelImpl implements Event {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a event model instance should use the {@link Event} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EventLocalServiceUtil.addEvent(this);
		}
		else {
			EventLocalServiceUtil.updateEvent(this);
		}
	}
}