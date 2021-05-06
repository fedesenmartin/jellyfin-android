package org.jellyfin.mobile.model.dto

import org.jellyfin.sdk.model.api.BaseItemDto
import org.jellyfin.sdk.model.api.ImageType

fun BaseItemDto.toUserViewInfo() = UserViewInfo(id, name.orEmpty(), collectionType.orEmpty(), imageTags[ImageType.PRIMARY])

fun BaseItemDto.toFolderInfo() = FolderInfo(id, name.orEmpty(), imageTags[ImageType.PRIMARY])
fun BaseItemDto.toAlbumInfo() = Album(id, name.orEmpty(), albumArtist.orEmpty(), artists.orEmpty(), imageTags[ImageType.PRIMARY])
fun BaseItemDto.toArtistInfo() = Artist(id, name.orEmpty(), imageTags[ImageType.PRIMARY])
fun BaseItemDto.toSongInfo() = Track(id, name.orEmpty(), artists.orEmpty(), albumId, imageTags[ImageType.PRIMARY])
fun BaseItemDto.toMusicVideoInfo() = MusicVideo(id, name.orEmpty(), artists.orEmpty(), album, imageTags[ImageType.PRIMARY])
