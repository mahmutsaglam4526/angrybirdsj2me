package defpackage;

import javax.microedition.m3g.Appearance;
import javax.microedition.m3g.Background;
import javax.microedition.m3g.Camera;
import javax.microedition.m3g.CompositingMode;
import javax.microedition.m3g.Graphics3D;
import javax.microedition.m3g.Image2D;
import javax.microedition.m3g.Mesh;
import javax.microedition.m3g.PolygonMode;
import javax.microedition.m3g.Texture2D;
import javax.microedition.m3g.Transform;
import javax.microedition.m3g.TriangleStripArray;
import javax.microedition.m3g.VertexArray;
import javax.microedition.m3g.VertexBuffer;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:bj.class */
public final class bj {
    Image2D[] a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    Transform[] f107a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Graphics3D f108a;
    private Mesh b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private float[] f110a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private VertexBuffer f111b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private TriangleStripArray f112a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Appearance f113a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private CompositingMode f115a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f116a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private boolean f117b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final short[] f118a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public VertexBuffer f119a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public VertexArray f120a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Mesh f121a;
    private VertexBuffer c;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private VertexArray f122b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Transform f109a = new Transform();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Background f114a = new Background();

    public bj() {
        new ap();
        this.a = new Image2D[28];
        this.f107a = new Transform[299];
        this.f113a = new Appearance();
        PolygonMode polygonMode = new PolygonMode();
        polygonMode.setCulling(162);
        this.f113a.setPolygonMode(polygonMode);
        this.f115a = new CompositingMode();
        this.f113a.setCompositingMode(this.f115a);
        this.f111b = new VertexBuffer();
        VertexArray vertexArray = new VertexArray(4, 3, 1);
        vertexArray.set(0, 4, new byte[]{0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0});
        this.f111b.setPositions(vertexArray, 1.0f, (float[]) null);
        VertexArray vertexArray2 = new VertexArray(4, 2, 1);
        vertexArray2.set(0, 4, new byte[]{0, 0, 1, 0, 0, 1, 1, 1});
        this.f111b.setTexCoords(0, vertexArray2, 1.0f, (float[]) null);
        this.f112a = new TriangleStripArray(0, new int[]{4});
        this.b = new Mesh(this.f111b, this.f112a, this.f113a);
        this.f110a = new float[16];
        this.f110a[0] = 1.0f;
        this.f110a[5] = 1.0f;
        this.f110a[10] = 1.0f;
        this.f110a[15] = 1.0f;
        Appearance appearance = new Appearance();
        appearance.setPolygonMode(polygonMode);
        this.f119a = new VertexBuffer();
        this.f120a = new VertexArray(3, 3, 2);
        this.f119a.setPositions(this.f120a, 1.0f, (float[]) null);
        this.f118a = new short[9];
        this.f121a = new Mesh(this.f119a, new TriangleStripArray(new int[]{0, 1, 2}, new int[]{3}), appearance);
        Appearance appearance2 = new Appearance();
        appearance2.setPolygonMode(polygonMode);
        this.c = new VertexBuffer();
        this.f122b = new VertexArray(4, 3, 2);
        this.c.setPositions(this.f122b, 1.0f, (float[]) null);
        new Mesh(this.c, new TriangleStripArray(new int[]{0, 1, 2, 3}, new int[]{4}), appearance2);
        this.f108a = Graphics3D.getInstance();
        a();
    }

    public final void a() {
        this.f108a = Graphics3D.getInstance();
        this.f108a.resetLights();
        Camera camera = new Camera();
        camera.setParallel(au.c(), au.m41b() / au.c(), -1.0f, 1.0f);
        Transform transform = new Transform();
        transform.postTranslate(au.m41b() / 2, au.c() / 2, 0.0f);
        transform.postScale(1.0f, -1.0f, 1.0f);
        this.f108a.setCamera(camera, transform);
        this.f108a.setViewport(0, 0, au.m41b(), au.c());
        this.f108a.clear((Background) null);
    }

    public final void a(int[] r5) {
        this.f116a = r5[0] == 1;
        this.f117b = r5[1] == 1;
    }

    public final void a(int r6, bh bhVar, float[] fArr, boolean z) {
        boolean z2 = bhVar.f105a;
        int r0 = bhVar.f106a[0];
        int r1 = bhVar.a();
        if (this.a[r0] == null) {
            if (!(bhVar.f104a instanceof Image2D)) {
                new StringBuffer().append("Invalid atlas image format in ").append(bhVar).toString();
            }
            az.c();
            this.a[r0] = (Image2D) bhVar.f104a;
        }
        Transform transform = null;
        if (z) {
            transform = this.f107a[r1];
        }
        if (transform == null) {
            Transform transform2 = new Transform();
            float f = bhVar.b;
            float f2 = bhVar.c;
            transform2.postTranslate(bhVar.f106a[3] / f, bhVar.f106a[4] / f2, 1.0f);
            transform2.postScale(bhVar.b() / f, bhVar.c() / f2, 1.0f);
            transform = transform2;
            if (z) {
                this.f107a[r1] = transform2;
            }
        }
        Texture2D texture2D = new Texture2D(this.a[r0]);
        texture2D.setTransform(transform);
        texture2D.setWrapping(240, 240);
        texture2D.setFiltering(208, this.f117b ? 210 : 209);
        this.f113a.setTexture(0, texture2D);
        this.f111b.setDefaultColor(r6);
        if (!z2) {
            this.f115a.setBlending(68);
        } else if (this.f116a) {
            this.f115a.setBlending(68);
            this.f115a.setAlphaThreshold(0.5f);
        } else {
            this.f115a.setBlending(64);
            this.f115a.setAlphaThreshold(0.0f);
        }
        this.f110a[0] = fArr[0];
        this.f110a[1] = fArr[1];
        this.f110a[3] = fArr[2];
        this.f110a[4] = fArr[3];
        this.f110a[5] = fArr[4];
        this.f110a[7] = fArr[5];
        this.f109a.set(this.f110a);
        this.f109a.postTranslate(bhVar.f106a[7], bhVar.f106a[8], 0.0f);
        this.f109a.postScale(bhVar.b(), bhVar.c(), 1.0f);
        this.f108a.render(this.b, this.f109a);
    }
}
