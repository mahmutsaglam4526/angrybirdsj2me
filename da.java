package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:da.class */
public final class da {
    private cv a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private co f241a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public int f243b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private float f244a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private float f245b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private float f246c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private float f247d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private static int c = -13625848;
    private static int d = 300;
    private static float j = 5.0f;
    private float k = 0.0f;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f240a = -1;
    private boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private boolean f242c = false;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f248a = false;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private boolean f249d = false;

    public da(co coVar, cv cvVar) {
        this.f241a = coVar;
        this.a = cvVar;
        a(0.0f, 0.0f, false);
        e();
        this.f243b = 30000;
    }

    public final void a() {
        if (this.f240a < 0) {
            if (!this.b) {
                if (this.f243b > 0) {
                    this.f243b = (int) (this.f243b - 33.0f);
                } else {
                    float f = 999999.0f;
                    int r10 = -1;
                    this.f242c = false;
                    for (int r11 = 0; r11 < this.f241a.f167a.f199a; r11++) {
                        cv cvVar = this.f241a.f167a.f198a[r11];
                        if (cvVar != null && cvVar.b && r10 == -1) {
                            float fA = co.a(cvVar, this.a);
                            if (fA < f) {
                                f = fA;
                                r10 = r11;
                            }
                        }
                    }
                    if (r10 >= 0) {
                        this.f240a = r10;
                        cv cvVar2 = this.f241a.f167a.f198a[this.f240a];
                        cvVar2.f219a = true;
                        cvVar2.f216a.a(false);
                        cvVar2.f218a = 400;
                        this.f246c = d;
                        this.f244a = cvVar2.f216a.f27a.a.f60a;
                        this.f245b = cvVar2.f216a.f27a.a.b;
                        this.h = cvVar2.m126a().f236a * 0.9f;
                        float f2 = cvVar2.m126a().f237b;
                        this.i = cvVar2.m126a().f238c / 8.0f;
                        this.f243b = 10000;
                        this.f249d = false;
                    } else {
                        this.f240a = -1;
                        this.b = true;
                    }
                    this.f248a = false;
                }
            }
        } else if (!this.f242c) {
            cv cvVar3 = this.f241a.f167a.f198a[this.f240a];
            this.f246c = Math.max(0.0f, this.f246c - 33.0f);
            float f3 = this.a.f216a.f27a.a.f60a + this.f247d;
            cvVar3.f216a.f27a.a.f60a = f3 + ((this.f246c * (this.f244a - f3)) / d);
            float f4 = this.a.f216a.f27a.a.b + this.e;
            cvVar3.f216a.f27a.a.b = f4 + ((this.f246c * (this.f245b - f4)) / d);
            if (this.f246c <= 0.0f) {
                cvVar3.f216a.f27a.a.f60a = f3;
                cvVar3.f216a.f27a.a.b = f4;
                this.f242c = true;
            }
        } else if (this.f242c) {
            this.k -= 33.0f;
            cv cvVar4 = this.f241a.f167a.f198a[this.f240a];
            cvVar4.f216a.f27a.a.f60a = this.a.f216a.f27a.a.f60a + this.f247d;
            cvVar4.f216a.f27a.a.b = this.a.f216a.f27a.a.b + this.e;
            am amVar = cvVar4.f216a;
            ap apVar = new ap(this.a.f216a.f27a.a.f60a + this.f247d, this.a.f216a.f27a.a.b + this.e);
            if (!amVar.f32a.a()) {
                amVar.f27a.f327a.a(0.0f);
                amVar.f27a.a.m22a(apVar);
                es.a(amVar.f27a, amVar.f28a.a, amVar.f28a.b);
                amVar.f28a.c.m22a(amVar.f28a.b);
                er erVar = amVar.f28a;
                amVar.f28a.f326b = 0.0f;
                erVar.f325a = 0.0f;
                eh ehVar = amVar.f32a.f43a.a;
                ev evVar = amVar.f35a;
                while (true) {
                    ev evVar2 = evVar;
                    if (evVar2 == null) {
                        break;
                    }
                    evVar2.a(ehVar, amVar.f27a, amVar.f27a);
                    evVar = evVar2.f334a;
                }
                amVar.f32a.f43a.a();
            }
            new ap(-this.f247d, -this.e);
            if (this.f249d) {
                float f5 = -this.f247d;
                float f6 = -this.e;
                float fA2 = co.a(f5, f6);
                float f7 = 46.25f * (fA2 / j);
                ap apVar2 = new ap((f7 * f5) / fA2, (f7 * f6) / fA2);
                float f8 = cvVar4.f216a.f27a.a.f60a;
                float f9 = cvVar4.f216a.f27a.a.b;
                short s = cvVar4.f214a.a;
                this.f241a.f167a.a(this.f240a, false);
                cv cvVarA = this.f241a.f167a.a(this.f240a, s, f8, f9);
                cvVarA.f216a.m15a();
                cvVarA.f216a.a(apVar2);
                cvVarA.f216a.e = 2.0f;
                cvVarA.f216a.f35a.c = cvVarA.a().c;
                cvVarA.f216a.f35a.b = cvVarA.a().f210b;
                cvVarA.f219a = false;
                cvVarA.b = false;
                cvVarA.f218a = 800;
                cvVarA.a((short) 2);
                this.f241a.f167a.b = this.f240a;
                this.f241a.f167a.c = 0;
                this.f240a = -1;
                this.f249d = false;
                this.f248a = false;
                this.f242c = false;
                e();
                this.f243b = 1000;
                if (this.f247d < 0.0f) {
                    this.f241a.f165a.g = (1000.0f * (this.f241a.f165a.a - cvVarA.f216a.f27a.a.f60a)) / Math.max(10.0f, apVar2.f60a);
                    this.f241a.f165a.g *= 0.5f;
                    this.f241a.f165a.b(4);
                    this.f241a.f165a.f180b = 1000;
                }
                this.f241a.f169a.a();
            }
        }
        if (this.f247d != this.f) {
            if (this.f247d < this.f) {
                this.f247d = Math.min(this.f, this.f247d + 0.33f);
            } else {
                this.f247d = Math.max(this.f, this.f247d - 0.33f);
            }
        }
        if (this.e != this.g) {
            if (this.e < this.g) {
                this.e = Math.min(this.g, this.e + 0.33f);
            } else {
                this.e = Math.max(this.g, this.e - 0.33f);
            }
        }
    }

    public final boolean a(float f, float f2) {
        float fA = co.a(this.a.f216a.f27a.a.f60a - f, this.a.f216a.f27a.a.b - f2);
        if (fA >= j * 2.0f) {
            return false;
        }
        if (!this.f242c) {
            return true;
        }
        this.f248a = true;
        this.f241a.f167a.f198a[this.f240a].f218a = 400;
        this.k = 250.0f;
        a(f - this.a.f216a.f27a.a.f60a, f2 - this.a.f216a.f27a.a.b, false);
        if (fA <= j) {
            return true;
        }
        a((this.f247d * j) / fA, (this.e * j) / fA, false);
        return true;
    }

    public final boolean b(float f, float f2) {
        if (!this.f248a) {
            return false;
        }
        c(f, f2);
        this.f249d = true;
        return true;
    }

    public final boolean c(float f, float f2) {
        if (!this.f248a) {
            return false;
        }
        float fA = co.a(this.f247d, this.e);
        a(f - this.a.f216a.f27a.a.f60a, f2 - this.a.f216a.f27a.a.b, false);
        float fA2 = co.a(this.f247d, this.e);
        if (fA2 > j) {
            a((this.f247d * j) / fA2, (this.e * j) / fA2, false);
        }
        float f3 = 0.5f + this.h;
        float f4 = 3.0f - (this.h + this.i);
        if (am.a(this.f247d) < f3 && this.e > f4) {
            float f5 = f4 / this.e;
            a(this.f247d * f5, this.e * f5, false);
        }
        if (this.k > 0.0f || fA2 <= fA || fA2 <= j * 0.5f) {
            return true;
        }
        this.k = 3000.0f;
        db.b(31);
        return true;
    }

    private void a(float f, float f2, boolean z) {
        if (z) {
            this.f = f;
            this.g = f2;
            return;
        }
        if (this.f247d == f) {
            float f3 = this.e;
        }
        this.f = f;
        this.f247d = f;
        this.g = f2;
        this.e = f2;
    }

    private void e() {
        a(-0.1f, 0.01f, true);
        float f = this.f;
        float f2 = this.f247d;
        float f3 = this.g;
        float f4 = this.e;
    }

    public final void b() {
        at.c();
        ap apVar = this.a.f216a.f27a.a;
        at.a(apVar.f60a, apVar.b);
        at.b(0.125f);
        at.a(44, -15.0f, -15.0f);
        a(true);
        at.d();
    }

    public final void c() {
        at.c();
        ap apVar = this.a.f216a.f27a.a;
        at.a(apVar.f60a, apVar.b);
        at.b(0.125f);
        at.a(45, -15.0f, -15.0f);
        a(false);
        at.d();
    }

    private void a(boolean z) {
        at.a(c);
        float fSqrt = (float) Math.sqrt((this.f247d * this.f247d) + (this.e * this.e));
        float f = this.f247d;
        float f2 = this.e;
        if (this.f242c) {
            f += this.h * (this.f247d / fSqrt);
            f2 += this.h * (this.e / fSqrt);
        }
        float f3 = f * 8.0f;
        float f4 = f2 * 8.0f;
        float f5 = (10.0f - ((5.0f * fSqrt) / j)) * 0.4f;
        float f6 = (z ? -20.0f : 15.0f) * 0.4f;
        ap apVarA = ap.a();
        ap apVarA2 = ap.a();
        ap apVarA3 = ap.a();
        apVarA.a(f3, f4);
        apVarA2.a(f6, 2.0f);
        apVarA3.b(apVarA2, apVarA);
        apVarA3.b(apVarA3, f5 / apVarA3.m29c());
        at.g();
        at.b(apVarA.f60a - apVarA3.f60a, apVarA.b - apVarA3.b);
        at.b(apVarA.f60a + apVarA3.f60a, apVarA.b + apVarA3.b);
        at.b(apVarA2.f60a - apVarA3.f60a, apVarA2.b - apVarA3.b);
        at.b(apVarA2.f60a + apVarA3.f60a, apVarA2.b + apVarA3.b);
        at.h();
        ap.a(3);
    }

    public final void d() {
        this.f248a = false;
        this.f247d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
    }
}
