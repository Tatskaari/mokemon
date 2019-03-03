package com.mygdx.game

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Batch
import java.lang.Math.floor

const val offsetX = 0
const val offsetY = 30
const val spriteWidth = 134
const val spriteHeight = 192
const val sheetWidth = 6


fun Texture.renderMokemon(mokedexNumber: Int, batch: Batch) {
  val index = mokedexNumber-1

  val xPos = index % sheetWidth
  val yPos = floor(index.toDouble() / sheetWidth.toDouble()).toInt()

  val srcX = offsetX + xPos * spriteWidth
  val srcY = offsetY + yPos*spriteHeight

  batch.draw(this, 0f, 0f, srcX, srcY, spriteWidth, spriteHeight)
}


