package com.mygdx.game.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.mygdx.game.MyGdxGame

fun main(args: Array<String>) {
  LwjglApplication(MyGdxGame(), LwjglApplicationConfiguration())
}