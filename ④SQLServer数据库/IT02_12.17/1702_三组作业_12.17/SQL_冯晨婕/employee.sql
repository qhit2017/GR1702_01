USE [db_employe]
GO
/****** Object:  Table [dbo].[tb_employe]    Script Date: 12/17/2017 19:29:34 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_employe](
	[id] [tinyint] NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[salary] [money] NOT NULL,
	[dateline] [date] NOT NULL,
	[remmend] [bit] NOT NULL,
	[departmend] [nvarchar](50) NOT NULL,
	[remark] [ntext] NOT NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
