USE [master]
GO
/****** Object:  Database [Sport_Shop]    Script Date: 12/11/2023 12:49:45 ******/
CREATE DATABASE [Sport_Shop]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Sport_Shop', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\Sport_Shop.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'Sport_Shop_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\Sport_Shop_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [Sport_Shop] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Sport_Shop].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Sport_Shop] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [Sport_Shop] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [Sport_Shop] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [Sport_Shop] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [Sport_Shop] SET ARITHABORT OFF 
GO
ALTER DATABASE [Sport_Shop] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [Sport_Shop] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [Sport_Shop] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [Sport_Shop] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [Sport_Shop] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [Sport_Shop] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [Sport_Shop] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [Sport_Shop] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [Sport_Shop] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [Sport_Shop] SET  ENABLE_BROKER 
GO
ALTER DATABASE [Sport_Shop] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [Sport_Shop] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [Sport_Shop] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [Sport_Shop] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [Sport_Shop] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [Sport_Shop] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [Sport_Shop] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [Sport_Shop] SET RECOVERY FULL 
GO
ALTER DATABASE [Sport_Shop] SET  MULTI_USER 
GO
ALTER DATABASE [Sport_Shop] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [Sport_Shop] SET DB_CHAINING OFF 
GO
ALTER DATABASE [Sport_Shop] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [Sport_Shop] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [Sport_Shop] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [Sport_Shop] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'Sport_Shop', N'ON'
GO
ALTER DATABASE [Sport_Shop] SET QUERY_STORE = OFF
GO
USE [Sport_Shop]
GO
/****** Object:  Table [dbo].[Anh]    Script Date: 12/11/2023 12:49:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Anh](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[ID_SanPhamChiTiet] [int] NOT NULL,
	[TrangThai] [nvarchar](50) NOT NULL,
	[create_at] [date] NULL,
	[create_by] [int] NOT NULL,
	[update_at] [date] NOT NULL,
	[update_by] [int] NOT NULL,
	[deleted] [bit] NOT NULL,
 CONSTRAINT [PK_Anh] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChatLieu]    Script Date: 12/11/2023 12:49:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChatLieu](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[TenChatLieu] [nvarchar](50) NOT NULL,
	[TrangThai] [nvarchar](50) NOT NULL,
	[create_at] [date] NULL,
	[create_by] [int] NOT NULL,
	[update_at] [date] NOT NULL,
	[update_by] [int] NOT NULL,
	[deleted] [bit] NOT NULL,
 CONSTRAINT [PK_ChatLieu] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DeGiay]    Script Date: 12/11/2023 12:49:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DeGiay](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Ten] [nvarchar](50) NOT NULL,
	[TrangThai] [nvarchar](50) NOT NULL,
	[create_at] [date] NULL,
	[create_by] [int] NOT NULL,
	[update_at] [date] NOT NULL,
	[update_by] [int] NOT NULL,
	[deleted] [bit] NOT NULL,
 CONSTRAINT [PK_DeGiay] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DiaChi]    Script Date: 12/11/2023 12:49:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DiaChi](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[ID_KhachHang] [int] NOT NULL,
	[thanhPho] [nvarchar](50) NOT NULL,
	[duong] [nvarchar](50) NOT NULL,
	[soNha] [varchar](20) NOT NULL,
	[create_at] [date] NULL,
	[create_by] [int] NOT NULL,
	[update_at] [date] NOT NULL,
	[update_by] [int] NOT NULL,
	[deleted] [bit] NOT NULL,
 CONSTRAINT [PK_DiaChi] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Hang]    Script Date: 12/11/2023 12:49:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Hang](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Ten] [nvarchar](50) NOT NULL,
	[TrangThai] [nvarchar](50) NOT NULL,
	[create_at] [date] NULL,
	[create_by] [int] NOT NULL,
	[update_at] [date] NOT NULL,
	[update_by] [int] NOT NULL,
	[deleted] [bit] NOT NULL,
 CONSTRAINT [PK_Hang] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 12/11/2023 12:49:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[ID_KhachHang] [int] NOT NULL,
	[ID_NhanVien] [int] NOT NULL,
	[TenKH] [nvarchar](50) NOT NULL,
	[sdt] [varchar](50) NOT NULL,
	[tongTien] [money] NOT NULL,
	[trangThai] [nvarchar](50) NOT NULL,
	[diaChi] [nvarchar](50) NOT NULL,
	[ngayShip] [date] NOT NULL,
	[ngayNhan] [date] NOT NULL,
	[ngayXacNhan] [date] NOT NULL,
	[ngayMuonNhan] [date] NOT NULL,
	[soTienGiam] [money] NOT NULL,
	[PhiShip] [money] NOT NULL,
	[HinhThucThanhToan] [nvarchar](50) NOT NULL,
	[create_at] [date] NULL,
	[create_by] [int] NOT NULL,
	[update_at] [date] NOT NULL,
	[update_by] [int] NOT NULL,
	[deleted] [bit] NOT NULL,
 CONSTRAINT [PK_HoaDon] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDonChiTiet]    Script Date: 12/11/2023 12:49:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDonChiTiet](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[ID_SanPhamChiTiet] [int] NOT NULL,
	[ID_HoaDon] [int] NOT NULL,
	[soLuong] [int] NOT NULL,
	[gia] [money] NOT NULL,
	[create_at] [date] NULL,
	[create_by] [int] NOT NULL,
	[update_at] [date] NOT NULL,
	[update_by] [int] NOT NULL,
	[deleted] [bit] NOT NULL,
 CONSTRAINT [PK_HoaDonChiTiet] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 12/11/2023 12:49:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[ID] [int] NOT NULL,
	[tenKH] [nvarchar](50) NOT NULL,
	[Sdt] [varchar](50) NOT NULL,
	[Email] [varchar](50) NOT NULL,
	[create_at] [date] NULL,
	[create_by] [int] NOT NULL,
	[update_at] [date] NOT NULL,
	[update_by] [int] NOT NULL,
	[deleted] [bit] NOT NULL,
	[GioiTinh] [bit] NOT NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang_Voucher]    Script Date: 12/11/2023 12:49:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang_Voucher](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[ID_KhachHang] [int] NOT NULL,
	[ID_VC] [int] NOT NULL,
	[soLuong] [int] NOT NULL,
	[TrangThai] [nvarchar](50) NOT NULL,
	[create_at] [date] NULL,
	[create_by] [int] NOT NULL,
	[update_at] [date] NOT NULL,
	[update_by] [int] NOT NULL,
	[deleted] [bit] NOT NULL,
 CONSTRAINT [PK_KhachHang_Voucher] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MauSac]    Script Date: 12/11/2023 12:49:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[MauSac](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[MaMau] [varchar](50) NOT NULL,
	[TenMau] [nvarchar](50) NOT NULL,
	[TrangThai] [nvarchar](50) NOT NULL,
	[create_at] [date] NULL,
	[create_by] [int] NOT NULL,
	[update_at] [date] NOT NULL,
	[update_by] [int] NOT NULL,
	[deleted] [bit] NOT NULL,
 CONSTRAINT [PK_MauSac] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 12/11/2023 12:49:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[ID_VaiTro] [int] NOT NULL,
	[MaCCCD] [varchar](12) NOT NULL,
	[TenNV] [nvarchar](50) NOT NULL,
	[Tuoi] [int] NOT NULL,
	[Email] [varchar](50) NOT NULL,
	[SDT] [varchar](50) NOT NULL,
	[DiaChi] [nvarchar](50) NOT NULL,
	[create_at] [date] NULL,
	[create_by] [int] NOT NULL,
	[update_at] [date] NOT NULL,
	[update_by] [int] NOT NULL,
	[deleted] [bit] NOT NULL,
	[MatKhau] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 12/11/2023 12:49:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Ten] [nvarchar](50) NOT NULL,
	[TrangThai] [nvarchar](50) NULL,
	[create_at] [date] NULL,
	[create_by] [int] NOT NULL,
	[update_at] [date] NOT NULL,
	[update_by] [int] NOT NULL,
	[deleted] [bit] NOT NULL,
 CONSTRAINT [PK_SanPham] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SanPhamChiTiet]    Script Date: 12/11/2023 12:49:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPhamChiTiet](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[ID_SanPham] [int] NOT NULL,
	[ID_MauSac] [int] NOT NULL,
	[ID_Size] [int] NOT NULL,
	[ID_Hang] [int] NOT NULL,
	[ID_ChatLieu] [int] NOT NULL,
	[ID_DeGiay] [int] NOT NULL,
	[MoTa] [nvarchar](50) NOT NULL,
	[SoLuongTon] [int] NOT NULL,
	[TrangThai] [nvarchar](50) NOT NULL,
	[create_at] [date] NULL,
	[create_by] [int] NOT NULL,
	[update_at] [date] NOT NULL,
	[update_by] [int] NOT NULL,
	[deleted] [bit] NOT NULL,
 CONSTRAINT [PK_SanPhamChiTiet] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Size]    Script Date: 12/11/2023 12:49:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Size](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Size] [int] NOT NULL,
	[TrangThai] [nvarchar](50) NOT NULL,
	[create_at] [date] NULL,
	[create_by] [int] NOT NULL,
	[update_at] [date] NOT NULL,
	[update_by] [int] NOT NULL,
	[deleted] [bit] NOT NULL,
 CONSTRAINT [PK_Size] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[VaiTro]    Script Date: 12/11/2023 12:49:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[VaiTro](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[tenVaiTro] [nvarchar](50) NOT NULL,
	[create_at] [date] NULL,
	[create_by] [int] NOT NULL,
	[update_at] [date] NOT NULL,
	[update_by] [int] NOT NULL,
	[deleted] [bit] NOT NULL,
 CONSTRAINT [PK_VaiTro] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Voucher]    Script Date: 12/11/2023 12:49:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Voucher](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[ID_HoaDon] [int] NOT NULL,
	[ID_NhanVien] [int] NOT NULL,
	[TenVC] [nvarchar](50) NOT NULL,
	[soLuong] [int] NOT NULL,
	[NgayBatDau] [date] NOT NULL,
	[NgayKetThuc] [date] NOT NULL,
	[create_at] [date] NULL,
	[create_by] [int] NOT NULL,
	[update_at] [date] NOT NULL,
	[update_by] [int] NOT NULL,
	[deleted] [bit] NOT NULL,
 CONSTRAINT [PK_Voucher] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Anh]  WITH CHECK ADD  CONSTRAINT [FK_Anh_SanPhamChiTiet] FOREIGN KEY([ID_SanPhamChiTiet])
REFERENCES [dbo].[SanPhamChiTiet] ([ID])
GO
ALTER TABLE [dbo].[Anh] CHECK CONSTRAINT [FK_Anh_SanPhamChiTiet]
GO
ALTER TABLE [dbo].[DiaChi]  WITH CHECK ADD  CONSTRAINT [FK_DiaChi_KhachHang] FOREIGN KEY([ID_KhachHang])
REFERENCES [dbo].[KhachHang] ([ID])
GO
ALTER TABLE [dbo].[DiaChi] CHECK CONSTRAINT [FK_DiaChi_KhachHang]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_KhachHang] FOREIGN KEY([ID_KhachHang])
REFERENCES [dbo].[KhachHang] ([ID])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_KhachHang]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_NhanVien] FOREIGN KEY([ID_NhanVien])
REFERENCES [dbo].[NhanVien] ([ID])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_NhanVien]
GO
ALTER TABLE [dbo].[HoaDonChiTiet]  WITH CHECK ADD  CONSTRAINT [FK_HoaDonChiTiet_HoaDon] FOREIGN KEY([ID_HoaDon])
REFERENCES [dbo].[HoaDon] ([ID])
GO
ALTER TABLE [dbo].[HoaDonChiTiet] CHECK CONSTRAINT [FK_HoaDonChiTiet_HoaDon]
GO
ALTER TABLE [dbo].[HoaDonChiTiet]  WITH CHECK ADD  CONSTRAINT [FK_HoaDonChiTiet_SanPhamChiTiet] FOREIGN KEY([ID_SanPhamChiTiet])
REFERENCES [dbo].[SanPhamChiTiet] ([ID])
GO
ALTER TABLE [dbo].[HoaDonChiTiet] CHECK CONSTRAINT [FK_HoaDonChiTiet_SanPhamChiTiet]
GO
ALTER TABLE [dbo].[KhachHang_Voucher]  WITH CHECK ADD  CONSTRAINT [FK_KhachHang_Voucher_KhachHang] FOREIGN KEY([ID_KhachHang])
REFERENCES [dbo].[KhachHang] ([ID])
GO
ALTER TABLE [dbo].[KhachHang_Voucher] CHECK CONSTRAINT [FK_KhachHang_Voucher_KhachHang]
GO
ALTER TABLE [dbo].[KhachHang_Voucher]  WITH CHECK ADD  CONSTRAINT [FK_KhachHang_Voucher_Voucher] FOREIGN KEY([ID_VC])
REFERENCES [dbo].[Voucher] ([ID])
GO
ALTER TABLE [dbo].[KhachHang_Voucher] CHECK CONSTRAINT [FK_KhachHang_Voucher_Voucher]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_VaiTro] FOREIGN KEY([ID_VaiTro])
REFERENCES [dbo].[VaiTro] ([ID])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_VaiTro]
GO
ALTER TABLE [dbo].[SanPhamChiTiet]  WITH CHECK ADD  CONSTRAINT [FK_SanPhamChiTiet_ChatLieu] FOREIGN KEY([ID_ChatLieu])
REFERENCES [dbo].[ChatLieu] ([ID])
GO
ALTER TABLE [dbo].[SanPhamChiTiet] CHECK CONSTRAINT [FK_SanPhamChiTiet_ChatLieu]
GO
ALTER TABLE [dbo].[SanPhamChiTiet]  WITH CHECK ADD  CONSTRAINT [FK_SanPhamChiTiet_DeGiay] FOREIGN KEY([ID_DeGiay])
REFERENCES [dbo].[DeGiay] ([ID])
GO
ALTER TABLE [dbo].[SanPhamChiTiet] CHECK CONSTRAINT [FK_SanPhamChiTiet_DeGiay]
GO
ALTER TABLE [dbo].[SanPhamChiTiet]  WITH CHECK ADD  CONSTRAINT [FK_SanPhamChiTiet_Hang] FOREIGN KEY([ID_Hang])
REFERENCES [dbo].[Hang] ([ID])
GO
ALTER TABLE [dbo].[SanPhamChiTiet] CHECK CONSTRAINT [FK_SanPhamChiTiet_Hang]
GO
ALTER TABLE [dbo].[SanPhamChiTiet]  WITH CHECK ADD  CONSTRAINT [FK_SanPhamChiTiet_MauSac] FOREIGN KEY([ID_MauSac])
REFERENCES [dbo].[MauSac] ([ID])
GO
ALTER TABLE [dbo].[SanPhamChiTiet] CHECK CONSTRAINT [FK_SanPhamChiTiet_MauSac]
GO
ALTER TABLE [dbo].[SanPhamChiTiet]  WITH CHECK ADD  CONSTRAINT [FK_SanPhamChiTiet_SanPham1] FOREIGN KEY([ID_SanPham])
REFERENCES [dbo].[SanPham] ([ID])
GO
ALTER TABLE [dbo].[SanPhamChiTiet] CHECK CONSTRAINT [FK_SanPhamChiTiet_SanPham1]
GO
ALTER TABLE [dbo].[SanPhamChiTiet]  WITH CHECK ADD  CONSTRAINT [FK_SanPhamChiTiet_Size] FOREIGN KEY([ID_Size])
REFERENCES [dbo].[Size] ([ID])
GO
ALTER TABLE [dbo].[SanPhamChiTiet] CHECK CONSTRAINT [FK_SanPhamChiTiet_Size]
GO
ALTER TABLE [dbo].[Voucher]  WITH CHECK ADD  CONSTRAINT [FK_Voucher_HoaDon] FOREIGN KEY([ID_HoaDon])
REFERENCES [dbo].[HoaDon] ([ID])
GO
ALTER TABLE [dbo].[Voucher] CHECK CONSTRAINT [FK_Voucher_HoaDon]
GO
ALTER TABLE [dbo].[Voucher]  WITH CHECK ADD  CONSTRAINT [FK_Voucher_NhanVien] FOREIGN KEY([ID_NhanVien])
REFERENCES [dbo].[NhanVien] ([ID])
GO
ALTER TABLE [dbo].[Voucher] CHECK CONSTRAINT [FK_Voucher_NhanVien]
GO
USE [master]
GO
ALTER DATABASE [Sport_Shop] SET  READ_WRITE 
GO
