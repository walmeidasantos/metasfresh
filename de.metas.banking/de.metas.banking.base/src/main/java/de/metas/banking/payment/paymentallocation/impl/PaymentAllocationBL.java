package de.metas.banking.payment.paymentallocation.impl;

import org.adempiere.service.ISysConfigBL;
import org.adempiere.util.Services;

import com.google.common.annotations.VisibleForTesting;

import de.metas.banking.payment.paymentallocation.IPaymentAllocationBL;

/*
 * #%L
 * de.metas.banking.base
 * %%
 * Copyright (C) 2015 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

public class PaymentAllocationBL implements IPaymentAllocationBL
{
	@VisibleForTesting
	public static final String SYSCONFIG_AllowAllocationOfPurchaseInvoiceAgainstSaleInvoice = "de.metas.banking.DifferenceRowBalancer.PurchaseInvoiceAgainstSaleInvoice";

	@Override
	public boolean isPurchaseSalesInvoiceCompensationAllowed()
	{
		return Services.get(ISysConfigBL.class)
				.getBooleanValue(SYSCONFIG_AllowAllocationOfPurchaseInvoiceAgainstSaleInvoice
						, false // default: not allowed
				);
	}

}
