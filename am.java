package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:am.class */
public final class am {
    public int a;
    public int b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final es f27a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final er f28a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final ap f29a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public float f30a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public final ap f31b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public an f32a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public am f33a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public am f34b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public ev f35a;
    public int c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public fr f36a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public fh f37a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public float f38b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public float f39c;
    private float g;
    public float d;
    public float e;
    public float f;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Object f40a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private em f41a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private es f42b;

    public am() {
    }

    public static final float a(float f) {
        return f > 0.0f ? f : -f;
    }

    public static final float b(float f) {
        return (float) Math.floor(f + 0.5f);
    }

    public static final float a(float f, float f2) {
        float f3 = f % f2;
        return f3 < 0.0f ? f3 + f2 : f3;
    }

    public static final float b(float f, float f2) {
        return Math.min(f, f2);
    }

    public static final float a(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final int m13a(float f) {
        return (int) Math.floor(f + 0.5f);
    }

    public am(et etVar, an anVar) {
        this.f27a = new es();
        this.f28a = new er();
        this.f29a = new ap();
        this.f30a = 0.0f;
        this.f31b = new ap();
        new ew();
        this.f41a = new em();
        this.f42b = new es();
        this.b = 0;
        if (etVar.d) {
            this.b |= 8;
        }
        if (etVar.c) {
            this.b |= 16;
        }
        if (etVar.f331a) {
            this.b |= 4;
        }
        if (etVar.f332b) {
            this.b |= 2;
        }
        if (etVar.e) {
            this.b |= 32;
        }
        this.f32a = anVar;
        this.f27a.a.a(etVar.f328a);
        this.f27a.f327a.a(etVar.f329a);
        this.f28a.a.m21a();
        er erVar = this.f28a;
        er erVar2 = this.f28a;
        float f = etVar.f329a;
        erVar2.f326b = f;
        erVar.f325a = f;
        es.a(this.f27a, this.f28a.a, this.f28a.b);
        this.f28a.c.a(this.f28a.b);
        this.f36a = null;
        this.f37a = null;
        this.f33a = null;
        this.f34b = null;
        this.f29a.a(etVar.b);
        this.f30a = 0.0f;
        this.e = etVar.f330b;
        this.f31b.m21a();
        this.f = 0.0f;
        this.a = etVar.a;
        if (this.a == 2) {
            this.f38b = 1.0f;
            this.f39c = 1.0f;
        } else {
            this.f38b = 0.0f;
            this.f39c = 0.0f;
        }
        this.g = 0.0f;
        this.d = 0.0f;
        this.f40a = null;
        this.f35a = null;
        this.c = 0;
    }

    public final ev a(ew ewVar) {
        if (this.f32a.a()) {
            return null;
        }
        ev evVar = new ev();
        evVar.b = ewVar.f341a;
        evVar.c = ewVar.b;
        evVar.f335a = this;
        evVar.f334a = null;
        eu euVar = evVar.f338a;
        eu euVar2 = ewVar.f342a;
        euVar.a = euVar2.a;
        euVar.b = euVar2.b;
        euVar.c = euVar2.c;
        evVar.f336a = ewVar.a.a();
        evVar.f333a = ewVar.c;
        if ((this.b & 32) == 32) {
            eh ehVar = this.f32a.f43a.a;
            evVar.f336a.a(evVar.a, this.f27a);
            dx dxVar = evVar.a;
            ei eiVar = ehVar.a;
            ej ejVarM163a = eiVar.m163a();
            ejVarM163a.a.a.f60a = dxVar.a.f60a - 0.1f;
            ejVarM163a.a.a.b = dxVar.a.b - 0.1f;
            ejVarM163a.a.b.f60a = dxVar.b.f60a + 0.1f;
            ejVarM163a.a.b.b = dxVar.b.b + 0.1f;
            ejVarM163a.f317a = evVar;
            eiVar.b(ejVarM163a);
            int r1 = eiVar.f307a >> 4;
            int r12 = eiVar.a();
            for (int r10 = 0; r12 > 64 && r10 < 10; r10++) {
                eiVar.a(r1);
                r12 = eiVar.a();
            }
            ehVar.f303a++;
            ehVar.a(ejVarM163a);
            evVar.f337a = ejVarM163a;
        }
        evVar.f334a = this.f35a;
        this.f35a = evVar;
        this.c++;
        evVar.f335a = this;
        if (evVar.f333a > 0.0f) {
            d();
        }
        this.f32a.a |= 1;
        return evVar;
    }

    public final void a(ap apVar) {
        if (this.a == 0) {
            return;
        }
        if (ap.m31a(apVar, apVar) > 0.0f) {
            a(true);
        }
        this.f29a.m22a(apVar);
    }

    public final void a(ap apVar, ap apVar2) {
        if (this.a != 2) {
            return;
        }
        if (!b()) {
            a(true);
        }
        this.f29a.f60a += apVar.f60a * this.f39c;
        this.f29a.b += apVar.b * this.f39c;
        this.f30a += this.d * (((apVar2.f60a - this.f28a.c.f60a) * apVar.b) - ((apVar2.b - this.f28a.c.b) * apVar.f60a));
    }

    private void d() {
        this.f38b = 0.0f;
        this.f39c = 0.0f;
        this.g = 0.0f;
        this.d = 0.0f;
        this.f28a.a.m21a();
        if (this.a == 0 || this.a == 1) {
            this.f28a.c.m22a(this.f27a.a);
            this.f28a.b.m22a(this.f27a.a);
            return;
        }
        ap apVarA = ap.a();
        apVarA.m21a();
        ap apVarA2 = ap.a();
        em emVar = this.f41a;
        ev evVar = this.f35a;
        while (true) {
            ev evVar2 = evVar;
            if (evVar2 == null) {
                break;
            }
            if (evVar2.f333a != 0.0f) {
                evVar2.f336a.a(emVar, evVar2.f333a);
                this.f38b += emVar.a;
                apVarA2.m22a(emVar.f321a).b(emVar.a);
                apVarA.m24b(apVarA2);
                this.g += emVar.b;
            }
            evVar = evVar2.f334a;
        }
        if (this.f38b > 0.0f) {
            this.f39c = 1.0f / this.f38b;
            apVarA.b(this.f39c);
        } else {
            this.f38b = 1.0f;
            this.f39c = 1.0f;
        }
        if (this.g <= 0.0f || (this.b & 16) != 0) {
            this.g = 0.0f;
            this.d = 0.0f;
        } else {
            this.g -= this.f38b * ap.m31a(apVarA, apVarA);
            this.d = 1.0f / this.g;
        }
        ap apVarA3 = ap.a();
        apVarA3.m22a(this.f28a.c);
        this.f28a.a.m22a(apVarA);
        es.a(this.f27a, this.f28a.a, this.f28a.b);
        this.f28a.c.m22a(this.f28a.b);
        apVarA2.m22a(this.f28a.c).m25c(apVarA3);
        apVarA2.a(this.f30a, apVarA2);
        this.f29a.m24b(apVarA2);
        ap.a(3);
    }

    public final void b(ap apVar, ap apVar2) {
        es.a(this.f27a, apVar, apVar2);
    }

    public final void c(ap apVar, ap apVar2) {
        al.a(this.f27a.f327a, apVar, apVar2);
    }

    public final int a() {
        return this.a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final boolean m14a() {
        return (this.b & 8) == 8;
    }

    public final void a(boolean z) {
        if (z) {
            if ((this.b & 2) == 0) {
                this.b |= 2;
                this.f = 0.0f;
                return;
            }
            return;
        }
        this.b &= -3;
        this.f = 0.0f;
        this.f29a.m21a();
        this.f30a = 0.0f;
        this.f31b.m21a();
    }

    public final boolean b() {
        return (this.b & 2) == 2;
    }

    public final boolean c() {
        return (this.b & 32) == 32;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void m15a() {
        this.b &= -17;
        d();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final am m16a() {
        return this.f34b;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final void m17b() {
        es esVar = this.f42b;
        esVar.f327a.a(this.f28a.f325a);
        al.a(esVar.f327a, this.f28a.a, esVar.a);
        esVar.a.b(-1.0f).m24b(this.f28a.b);
        eh ehVar = this.f32a.f43a.a;
        ev evVar = this.f35a;
        while (true) {
            ev evVar2 = evVar;
            if (evVar2 == null) {
                return;
            }
            evVar2.a(ehVar, esVar, this.f27a);
            evVar = evVar2.f334a;
        }
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public final void m18c() {
        float fCos = (float) Math.cos(this.f28a.f326b);
        float fSin = (float) Math.sin(this.f28a.f326b);
        this.f27a.f327a.a.f60a = fCos;
        this.f27a.f327a.b.f60a = -fSin;
        this.f27a.f327a.a.b = fSin;
        this.f27a.f327a.b.b = fCos;
        this.f27a.a.f60a = (this.f27a.f327a.a.f60a * this.f28a.a.f60a) + (this.f27a.f327a.b.f60a * this.f28a.a.b);
        this.f27a.a.b = (this.f27a.f327a.a.b * this.f28a.a.f60a) + (this.f27a.f327a.b.b * this.f28a.a.b);
        ap apVar = this.f27a.a;
        apVar.f60a = -apVar.f60a;
        ap apVar2 = this.f27a.a;
        apVar2.b = -apVar2.b;
        this.f27a.a.f60a += this.f28a.c.f60a;
        this.f27a.a.b += this.f28a.c.b;
    }

    public final boolean a(am amVar) {
        if (this.a != 2 && amVar.a != 2) {
            return false;
        }
        fr frVar = this.f36a;
        while (true) {
            fr frVar2 = frVar;
            if (frVar2 == null) {
                return true;
            }
            if (amVar == null) {
                return false;
            }
            frVar = frVar2.b;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void m19a(float f) {
        er erVar = this.f28a;
        erVar.b.f60a = ((1.0f - f) * erVar.b.f60a) + (f * erVar.c.f60a);
        erVar.b.b = ((1.0f - f) * erVar.b.b) + (f * erVar.c.b);
        erVar.f325a = ((1.0f - f) * erVar.f325a) + (f * erVar.f326b);
        this.f28a.c.m22a(this.f28a.b);
        this.f28a.f326b = this.f28a.f325a;
        m18c();
    }
}
