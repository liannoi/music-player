package org.itstep.liannoi.miler.application.common.interfaces

import org.itstep.liannoi.miler.application.storage.music.models.RawMusicModel
import org.itstep.liannoi.miler.infrastructure.MusicPlayer

interface MusicPlayerFacade {
    fun play(model: RawMusicModel, handler: MusicPlayer.Handler)
    fun pause(handler: MusicPlayer.Handler)
    fun pauseOrContinue(handler: MusicPlayer.Handler)
    fun back()
    fun forward()
    fun info(): MusicPlayer.PlayingDetails
    fun loop()
    fun stop()
    fun destroy()
    fun playNext(handler: MusicPlayer.Handler)
    fun playPrevious(handler: MusicPlayer.Handler)
    fun playStream(streamDetails: MusicPlayer.StreamDetails, handler: MusicPlayer.Handler)
}
