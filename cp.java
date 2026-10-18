package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:cp.class */
public final class cp {
    public float a;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    public float b;
    public float c;
    public float d;
    public float e;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private co f176a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f177a;
    private float p;
    private float q;
    private float r;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private int f178c;
    private static float s = 1000.0f;
    private static float t = 10.0f;
    private static float u = 25.0f;
    private static float v = 300.0f;
    private static float w = ac.a / 8.0f;
    private static float x = ac.b / 8.0f;
    public static float f;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private static int f179d;
    public float g;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public int f180b;
    private float y;
    private float z;
    private float A;
    private float B;
    public float h;
    public float i;
    private static float E;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f181a;
    private float F;
    private float G;
    private float H;
    private float I;
    private float J;
    private float K;
    private float L;
    private float M;
    private float N;
    private float O;
    private float P;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private boolean f182b;
    private float D = 1.0f;
    private float C = 1.0f;

    public cp(co coVar, cq cqVar) {
        this.f176a = coVar;
        this.a = cqVar.a;
        this.j = cqVar.b;
        this.k = cqVar.c;
        this.l = cqVar.d;
        this.m = cqVar.e;
        this.n = cqVar.f;
        this.z = cqVar.i;
        this.A = cqVar.j;
        this.h = cqVar.k;
        this.i = cqVar.l;
        this.y = cqVar.m;
        this.B = 0.0f - ((ac.b / 8.0f) / this.y);
        this.o = this.a - this.l;
        float f2 = this.j;
        float f3 = this.m;
        float f4 = this.k;
        float f5 = this.n;
        this.g = 2000.0f;
        this.f180b = 1000;
        this.e = -1.0f;
        this.b = this.a;
        this.c = this.j;
        this.d = this.k;
        this.e = 10000.0f;
        this.L = this.b;
        this.M = this.c;
        this.N = this.d;
        this.O = this.d;
        this.f182b = true;
        this.P = 20.0f;
        this.f177a = 1;
    }

    public final void a() {
        if (this.f180b > 0) {
            this.f180b -= 33;
            if (this.f180b <= 0) {
                if (this.f176a.m107a()) {
                    this.f180b = -1;
                    e();
                    if (this.f176a.f168a.f240a < 0 && this.f176a.f168a.f243b > f179d) {
                        this.f176a.f168a.f243b = f179d;
                    }
                } else {
                    this.f180b = 500;
                }
            }
        }
        this.K = this.y + ((this.n - this.y) * this.C);
        float f2 = (this.K - this.y) / (this.n - this.y);
        this.J = (this.m * f2) + (this.j * (1.0f - f2));
        float f3 = this.J + (((ac.b * 0.5f) / this.K) / 8.0f);
        float f4 = (ac.b / (this.y * 5.0f)) / 8.0f;
        if (f3 > f4) {
            this.J += f4 - f3;
        }
        this.I = this.l;
        float f5 = this.I - (((ac.a * 0.5f) / this.K) / 8.0f);
        if (f5 < this.z) {
            this.I += this.z - f5;
        }
        this.H = this.y + ((this.k - this.y) * this.C);
        this.G = this.j;
        float f6 = this.G + (((ac.b * 0.5f) / this.H) / 8.0f);
        float f7 = (ac.b / (this.y * 5.0f)) / 8.0f;
        if (f6 > f7) {
            this.G += f7 - f6;
        }
        this.F = this.a;
        float f8 = this.F + (((ac.a * 0.5f) / this.H) / 8.0f);
        if (f8 > this.A) {
            this.F += this.A - f8;
        }
        if (this.D != this.C) {
            if (this.C < this.D) {
                this.C = Math.min(this.D, this.C + 0.066f);
            } else if (this.C > this.D) {
                this.C = Math.max(this.D, this.C - 0.066f);
            }
        }
        float f9 = this.e;
        if (this.f177a == 1) {
            float f10 = f9 + (33.0f * this.P);
            float f11 = f10;
            if (f10 >= 10000.0f) {
                f11 = 10000.0f;
                b(0);
            }
            this.e = f11;
        } else if (this.f177a == 4) {
            this.f182b = true;
        } else if (this.f177a == 2) {
            float f12 = f9 - (33.0f * this.P);
            float f13 = f12;
            if (f12 <= 0.0f) {
                f13 = 0.0f;
                b(0);
            }
            this.e = f13;
        } else if (this.f177a == 3) {
            c(33);
        }
        float f14 = this.e;
        float f15 = ac.a / 8.0f;
        float f16 = ac.b / 8.0f;
        float f17 = this.z;
        float f18 = this.A;
        float f19 = 0.1155f;
        if (this.e < 0.0f) {
            this.f182b = true;
            this.P = 0.0f;
        }
        if (this.e > 10000.0f) {
            this.f182b = true;
            this.P = 0.0f;
        }
        if (this.f177a != 4 && this.o != 0.0f) {
            if (!this.f182b) {
                f19 = 1.0f;
            }
            float f20 = f14 / 10000.0f;
            float f21 = this.K + ((this.H - this.K) * f20);
            float f22 = this.I + ((this.F - this.I) * f20);
            float f23 = this.J + ((this.G - this.J) * f20);
            this.L -= (this.L - f22) * f19;
            this.M -= (this.M - f23) * f19;
            this.N -= (this.N - f21) * f19;
            this.b = this.L;
            this.c = this.M;
            this.d = this.N;
        }
        if (this.f177a == 4) {
            if (this.f176a.f167a.b < 0 || this.f176a.f167a.f198a[this.f176a.f167a.b] == null) {
                b(1);
                this.f180b = 1000;
                return;
            }
            ap apVar = this.f176a.f167a.f198a[this.f176a.f167a.b].f216a.f27a.a;
            float f24 = apVar.f60a;
            float f25 = apVar.b;
            float f26 = this.f176a.f167a.f198a[this.f176a.f167a.b].f216a.f29a.f60a;
            if (f26 > 0.0f && this.o != 0.0f) {
                f14 = (float) (((double) f14) + (((((double) (0.033f * f26)) * 10.0d) / ((double) this.o)) * 10000.0d));
            }
            if (f14 >= 10000.0f) {
                f14 = 10000.0f;
                if (this.f176a.f167a.b < 0) {
                    b(0);
                }
            }
            this.e = f14;
            float f27 = f14 / 10000.0f;
            float f28 = this.K + ((this.H - this.K) * f27);
            float f29 = this.I + ((this.F - this.I) * f27);
            float f30 = this.J + ((this.G - this.J) * f27);
            this.N -= (this.N - f28) * f19;
            this.L -= (this.L - f29) * f19;
            this.M -= (this.M - f30) * f19;
            float f31 = this.L - ((f15 * 0.5f) / this.N);
            float f32 = this.M - ((f16 * 0.5f) / this.N);
            float f33 = this.L + ((f15 * 0.5f) / this.N);
            float f34 = this.M + ((f16 * 0.5f) / this.N);
            float fMin = Math.min(f31, f24 - 6.25f);
            float fMin2 = Math.min(f32, f25 - 6.25f);
            float fMax = Math.max(f33, f24 + 6.25f);
            float fMax2 = Math.max(f34, f25 + 6.25f);
            float fMax3 = Math.max(f17, fMin);
            float fMin3 = Math.min(f18, fMax);
            float fMin4 = Math.min(am.a(f15 / (fMin3 - fMax3)), am.a(f16 / (fMax2 - fMin2)));
            float fA = fMin4;
            if (fMin4 > this.N) {
                fA = this.N;
            }
            float f35 = (fMin3 + fMax3) * 0.5f;
            float f36 = (fMax2 + fMin2) * 0.5f;
            boolean z = false;
            if (((double) f35) + ((((double) f15) * 0.5d) / ((double) fA)) > f18) {
                fMin3 = f18;
                fMax3 = f18 - (f15 / fA);
                z = true;
                if (fMax3 < f17) {
                    fMax3 = f17;
                }
            }
            if (((double) f35) - ((((double) f15) * 0.5d) / ((double) fA)) < f17) {
                fMax3 = f17;
                fMin3 = f17 + (f15 / fA);
                z = true;
                if (fMin3 > f18) {
                    fMin3 = f18;
                }
            }
            if (z) {
                f35 = (fMin3 + fMax3) * 0.5f;
                fA = am.a(f15 / (fMin3 - fMax3));
            }
            if (((double) f36) - ((((double) f16) * 0.5d) / ((double) fA)) < this.B) {
                f36 = this.B + ((f16 * 0.5f) / fA);
            }
            this.b -= (this.b - f35) * f19;
            this.O -= (this.O - fA) * f19;
            this.d = this.O;
            this.c -= (this.c - f36) * f19;
            if (f24 >= f18 || f24 <= f17) {
                this.N = this.d;
                this.L = this.b;
                this.M = this.c;
            }
            if (((double) f36) - ((((double) f16) * 0.5d) / ((double) am.a(f15 / (fMin3 - fMax3)))) < this.B) {
                float f37 = this.B;
            }
        }
    }

    public final void a(int r6) {
        if (r6 < 0) {
            this.D = Math.min(1.0f, this.D + 0.1f);
        } else if (r6 > 0) {
            this.D = Math.max(0.0f, this.D - 0.1f);
        }
    }

    public final void b(int r4) {
        this.L = this.b;
        this.M = this.c;
        this.N = this.d;
        this.O = this.d;
        this.f177a = r4;
        if (r4 != 2) {
            if (r4 == 4) {
                float f2 = this.d;
            }
        } else {
            if (this.f176a.f168a.f240a >= 0 || this.f176a.f168a.f243b <= f179d) {
                return;
            }
            this.f176a.f168a.f243b = f179d;
        }
    }

    public final void a(float f2) {
        this.f180b = -1;
        b(3);
        this.f178c = 0;
        this.p = f2;
        this.r = f2;
        this.q = f2;
        if (this.f176a.f168a.f240a < 0 && this.f176a.f168a.f243b > f179d) {
            this.f176a.f168a.f243b = f179d;
        }
        this.L = this.b;
        this.M = this.c;
        this.N = this.d;
        this.O = this.d;
        if (am.a(this.F - this.I) > 0.001d) {
            this.e = ((this.b - this.I) / (this.F - this.I)) * 10000.0f;
        }
    }

    private void c(int r8) {
        float f2 = this.e;
        this.f178c += r8;
        float f3 = this.q - this.r;
        if (this.o > 0.0f) {
            float f4 = f2 - ((f3 / ((this.o * 8.0f) * this.d)) * 10000.0f);
            this.f182b = false;
            if (f4 < 0.0f) {
                f4 = (float) (((double) f4) - (((double) f4) * 0.3d));
                this.f182b = true;
            }
            if (f4 > 10000.0f) {
                f4 += (10000.0f - f4) * 0.3f;
                this.f182b = true;
            }
            this.e = f4;
        }
        this.r = this.q;
    }

    public final void b(float f2) {
        if (this.f177a == 3) {
            this.q = f2;
        }
    }

    public final void c(float f2) {
        if (this.f177a == 3) {
            b(0);
            this.q = f2;
            float fA = am.a(this.q - this.p);
            if (this.f178c < s && fA >= t && fA >= (u * this.f178c) / 1000.0f) {
                this.P = ((fA / this.d) / this.f178c) * 10.0f;
                if (this.q < this.p) {
                    b(1);
                } else {
                    b(2);
                }
                this.f182b = false;
                if (this.e < 0.0f) {
                    this.f182b = true;
                }
                if (this.e > 10000.0f) {
                    this.f182b = true;
                    return;
                }
                return;
            }
            if (this.f178c < v) {
                e();
                this.P = 500.0f;
                this.f182b = true;
                return;
            }
            c(0);
            this.f180b = 0;
            if (this.e < 5000.0f) {
                b(2);
            } else {
                b(1);
            }
            this.P = 20.0f;
            this.f182b = true;
        }
    }

    public final void b() {
        this.D = 1.0f;
        this.P = 20.0f;
    }

    private void e() {
        if (this.f177a == 1) {
            b(2);
            return;
        }
        if (this.f177a == 2) {
            b(1);
        } else if (this.e >= 5000.0f) {
            b(2);
        } else if (this.e <= 5000.0f) {
            b(1);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final float m110a(float f2) {
        return this.b + ((((ac.a / 2) + ((f2 - (ac.a / 2)) * (1.0f / this.d))) - (ac.a / 2)) / 8.0f);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final float m111b(float f2) {
        return this.c + ((((ac.b / 2) + ((f2 - (ac.b / 2)) * (1.0f / this.d))) - (ac.b / 2)) / 8.0f);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public final float m112c(float f2) {
        return (f2 - this.c) * 8.0f;
    }

    public final void c() {
        E = this.D;
    }

    public final void d() {
        if (E >= 0.0f) {
            this.D = E;
            E = -1.0f;
        }
    }

    static {
        float f2 = w;
        float f3 = w;
        f = 0.0f - (5.0f * x);
        f179d = 100;
        E = -1.0f;
    }
}
