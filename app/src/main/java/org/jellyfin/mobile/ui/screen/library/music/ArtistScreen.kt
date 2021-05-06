package org.jellyfin.mobile.ui.screen.library.music

import androidx.compose.runtime.Composable
import org.jellyfin.mobile.model.dto.Artist
import org.jellyfin.mobile.ui.ScreenScaffold
import org.jellyfin.mobile.ui.screen.AbstractScreen

class ArtistScreen(private val viewInfo: Artist) : AbstractScreen() {

    @Composable
    override fun Content() {
        ScreenScaffold(
            title = viewInfo.name,
            canGoBack = true,
            hasElevation = false,
        ) {

        }
    }
}
