package com.mygdx.game

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Camera
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.utils.viewport.ExtendViewport
import com.badlogic.gdx.physics.box2d.World
import com.badlogic.gdx.math.Vector2

class MyGdxGame : ApplicationAdapter() {
  private lateinit var batch: SpriteBatch
  private lateinit var mokemonTexture: Texture
  private lateinit var nonCopyright: Texture
  private lateinit var cam: Camera
  private lateinit var viewport: ExtendViewport
  private lateinit var world: World


  override fun create() {
    batch = SpriteBatch()
    mokemonTexture = Texture("mokemon.jpg")
    nonCopyright = Texture("grass.png")
    cam = OrthographicCamera()
    viewport = ExtendViewport(800f, 600f, cam)
    world = World(Vector2(0f, -10f), true)
  }

  override fun render() {
    Gdx.gl.glClearColor(1f, 0f, 0f, 1f)
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
    cam.update()
    batch.projectionMatrix = cam.combined

    batch.begin()
    batch.draw(nonCopyright, 100f, 100f)

    mokemonTexture.renderMokemon(30, batch)
    batch.end()
  }

  override fun resize(width: Int, height: Int) {
    viewport.update(width, height, true)

  }

  override fun dispose() {
    batch.dispose()
    mokemonTexture.dispose()
  }
}
