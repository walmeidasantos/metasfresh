package de.metas.material.event.pporder;

import org.eevolution.model.I_PP_Order;

import de.metas.material.event.EventDescr;
import de.metas.material.event.MaterialEvent;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

/*
 * #%L
 * metasfresh-material-event
 * %%
 * Copyright (C) 2017 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */
/**
 * Send by the material dispo when it wants a {@link I_PP_Order} to be created.
 * <p>
 * <b>Important: right now, any {@link PPOrderLine}s are ignored</b>. The receiver of this event will mostly use
 * the event's {@link PPOrder}'s {@link PPOrder#getProductPlanningId()} to create the @{code PP_Order}.
 *
 * @author metas-dev <dev@metasfresh.com>
 *
 */
@Value
@Builder
public class PPOrderRequestedEvent implements MaterialEvent
{
	public static final String TYPE = "PPOrderRequestedEvent";

	@NonNull
	EventDescr eventDescr;

	@NonNull
	PPOrder ppOrder;

	int groupId;
}