package org.jellyfin.mobile.ui.screen.library

import androidx.lifecycle.ViewModel
import org.jellyfin.mobile.model.dto.UserViewInfo
import org.jellyfin.sdk.api.client.ApiClient
import org.koin.core.KoinComponent
import org.koin.core.inject

abstract class LibraryViewModel(protected val viewInfo: UserViewInfo) : ViewModel(), KoinComponent {
    protected val apiClient: ApiClient by inject()
}
