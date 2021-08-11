/*
 *  SPDX-License-Identifier: Apache-2.0
 *
 *  The OpenSearch Contributors require contributions made to
 *  this file be licensed under the Apache-2.0 license or a
 *  compatible open source license.
 *
 *  Modifications Copyright OpenSearch Contributors. See
 *  GitHub history for details.
 */

package org.opensearch.notifications.spi.credentials

import com.amazonaws.auth.AWSCredentialsProvider
import org.opensearch.notifications.spi.model.destination.SNSDestination

interface CredentialsProvider {
    fun getCredentialsProvider(destination: SNSDestination): AWSCredentialsProvider
}